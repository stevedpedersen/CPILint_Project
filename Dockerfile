FROM jnj-docker.artifactrepo.jnj.com/debian:stable-slim

# Set the shell to bash with strict error handling
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# --- LOCAL
RUN mkdir -p /usr/local/share/ca-certificates/extra
COPY ./ZscalerRootCA.crt /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt

# --- REMOTE
# COPY --from=jnj-docker.artifactrepo.jnj.com/zscaler-root-ca:9c56828d9951fa3ccfcb8108b89cf00b \
#    /ZscalerRootCA.crt /usr/local/share/ca-certificates/extra/ZscalerRootCA.crt

RUN apt-get update && \
    apt-get full-upgrade -yqq && \
    apt-get install -yqq --no-install-recommends \
        curl unzip ca-certificates java-common && \
    apt-get clean && rm -rf /var/lib/apt/lists/* && update-ca-certificates


RUN curl -sSL -o jdk.deb https://corretto.aws/downloads/latest/amazon-corretto-17-x64-linux-jdk.deb && \
    dpkg --install jdk.deb && rm -f jdk.deb


RUN useradd -ms /bin/bash cpilint && mkdir -p /home/cpilint && chmod -R 777 /home/cpilint
USER cpilint
WORKDIR /home/cpilint

# --- LOCAL
COPY cpilint/docker-release/cpilint-1.0.5-docker.zip ./cpilint-release.zip
RUN unzip cpilint-release.zip -d ./runtime && rm cpilint-release.zip && chmod +x /home/cpilint/runtime/bin/*

# --- REMOTE
# ARG VERSION
# RUN curl -sSL "https://sourcecode.jnj.com/scm/asx-jeas/cpilint.git/docker-release/cpilint-${VERSION}-docker.zip" \
#   -o cpilint-release.zip && unzip cpilint-release.zip -d ./runtime && rm cpilint-release.zip

# The image now contains the runtime artifacts under /cpilint/runtime.
CMD ["bash"]