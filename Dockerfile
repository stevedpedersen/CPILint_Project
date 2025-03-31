FROM jnj-docker.artifactrepo.jnj.com/debian:stable-slim

# Set the shell to bash with strict error handling
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# --- LOCAL APPROACH ---
RUN mkdir -p /usr/local/share/ca-certificates/extra
COPY ./ZscalerRootCA.crt /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt

# --- REMOTE APPROACH ---
# COPY --from=jnj-docker.artifactrepo.jnj.com/zscaler-root-ca:9c56828d9951fa3ccfcb8108b89cf00b \
#    /ZscalerRootCA.crt /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt

# Install required packages and Amazon Corretto 17 JDK
RUN apt-get update && \
    apt-get full-upgrade -yqq && \
    apt-get install -yqq --no-install-recommends \
        curl \
        unzip \
        java-common \
        ca-certificates && \
    update-ca-certificates && \
    curl -sSL -o jdk.deb https://corretto.aws/downloads/latest/amazon-corretto-17-x64-linux-jdk.deb && \
    dpkg --install jdk.deb && rm -f jdk.deb && \
    apt-get autoremove -yqq && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set timezone
ENV TZ=America/New_York
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
    echo $TZ > /etc/timezone && \
    dpkg-reconfigure --frontend=noninteractive tzdata

# Add cpilint user, switch to it
RUN useradd -ms /bin/bash cpilint
USER cpilint
WORKDIR /home/cpilint

# --- LOCAL APPROACH ---
ARG VERSION=1.0.5
COPY cpilint/docker-release/cpilint-${VERSION}-docker.zip ./cpilint-release.zip
RUN unzip cpilint-release.zip -d ./runtime && \
    rm cpilint-release.zip

# --- REMOTE APPROACH ---
# RUN curl -sSL "https://sourcecode.jnj.com/scm/asx-jeas/cpilint.git/docker-release/cpilint-${VERSION}-docker.zip" \
#     -o cpilint-release.zip && \
#     unzip cpilint-release.zip -d ./runtime && \
#     rm cpilint-release.zip

# Entrypoint set to runtime working directory
WORKDIR /home/cpilint/runtime

# The image now contains the runtime artifacts under /cpilint/runtime.
CMD ["bash"]