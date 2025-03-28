FROM jnj-docker.artifactrepo.jnj.com/debian:bookworm-slim

# Set the shell to bash with strict error handling
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# Import ZScaler Root CA
RUN mkdir -p /usr/local/share/ca-certificates/extra
COPY --from=jnj-docker.artifactrepo.jnj.com/zscaler-root-ca:9c56828d9951fa3ccfcb8108b89cf00b \
    /ZscalerRootCA.crt \
    /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt

# Install required packages
RUN apt-get update && \
    apt-get full-upgrade -yqq && \
    apt-get install -yqq --no-install-recommends git tmux htop maven shellcheck unzip locales build-essential clang cmake gdb && \
        curl \
        zip \
        unzip \
        jq \
        xmllint \
        maven \
        build-essential \
        ca-certificates \
        update-ca-certificates \
        java-common && \
        curl -sSL -o jdk.deb https://corretto.aws/downloads/latest/amazon-corretto-17-x64-linux-jdk.deb && \
        dpkg --install jdk.deb && rm -f jdk.deb && \
    apt-get autoremove -y && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set timezone
ENV TZ=America/New_York
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone && \
    dpkg-reconfigure --frontend=noninteractive tzdata

# Create and set working directory
WORKDIR /cpilint

# Copy project files into the container
# COPY build.xml .
COPY scripts/ ./scripts/
COPY rulesets/ ./rulesets/
# COPY src/ ./src/
COPY lib/ ./lib/
COPY resources/ ./resources/
# Include the cpilint release zip if it exists in your repo:
COPY cpilint-release/ cpilint-release/ 

# Install CPILint from the release zip
RUN unzip cpilint-release/cpilint-latest-linux-amd64.zip -d /usr/local/bin && \
    chmod +x /usr/local/bin/cpilint && \
    rm cpilint-release/cpilint-latest-linux-amd64.zip

# Default command to start a shell (adjust as needed)
CMD ["bash"]
