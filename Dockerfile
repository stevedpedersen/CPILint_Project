# Use your internal debian base image
FROM jnj-docker.artifactrepo.jnj.com/debian:stable-slim

# Set the shell to bash with strict error handling
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# Import ZScaler Root CA from local copy if available;
# if not, fallback to the remote approach (commented out).
RUN mkdir -p /usr/local/share/ca-certificates/extra
# LOCAL approach: copy local ZscalerRootCA.crt (placed in the same directory as Dockerfile)
COPY ./ZscalerRootCA.crt /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt
# REMOTE approach (commented out):
# COPY --from=jnj-docker.artifactrepo.jnj.com/zscaler-root-ca:9c56828d9951fa3ccfcb8108b89cf00b \
#    /ZscalerRootCA.crt /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt

# Install required packages and Amazon Corretto 17 JDK
RUN apt-get update && \
    apt-get full-upgrade -yqq && \
    apt-get dist-upgrade -yqq && \
    apt-get install -yqq --no-install-recommends \
        curl \
        zip \
        unzip \
        jq \
        maven \
        build-essential \
        ca-certificates \
        java-common && \
    update-ca-certificates && \
    curl -sSL -o jdk.deb https://corretto.aws/downloads/latest/amazon-corretto-17-x64-linux-jdk.deb && \
    dpkg --install jdk.deb && rm -f jdk.deb && \
    apt-get autoremove -y && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set timezone
ENV TZ=America/New_York
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
    echo $TZ > /etc/timezone && \
    dpkg-reconfigure --frontend=noninteractive tzdata

# Create and set working directory
WORKDIR /cpilint
# Make /cpilint writable for all (for testing)
RUN chmod -R 777 /cpilint

# --- LOCAL APPROACH ---
# Copy the CPILint release zip (built from the cpilint submodule) into the image.
# We assume the release zip is in cpilint/docker-release/ relative to the repo root.
ARG VERSION=1.0.5
COPY cpilint/docker-release/ cpilint-release/
RUN unzip cpilint-release/cpilint-${VERSION}-docker.zip -d /cpilint/runtime && \
    rm -rf cpilint-release

# --- REMOTE APPROACH (alternative) ---
# Uncomment these lines to fetch the release zip from Bitbucket instead.
# RUN curl -sSL "https://sourcecode.jnj.com/scm/asx-jeas/cpilint.git/path/to/cpilint-release.zip" -o cpilint-release.zip && \
#     unzip cpilint-release.zip -d /cpilint/runtime && \
#     rm cpilint-release.zip

# The image now contains the runtime artifacts under /cpilint/runtime.
CMD ["bash"]