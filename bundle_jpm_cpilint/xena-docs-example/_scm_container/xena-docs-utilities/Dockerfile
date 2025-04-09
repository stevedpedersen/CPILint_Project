#-------------------------------------------------------------------------------
# XENA Documentation Utilities
# Image maintained by XENA Open DevOps Community
#-------------------------------------------------------------------------------

FROM jnj.artifactrepo.jnj.com/alpine:latest

# This image includes "vscode" non-root user with sudo access for integration of
# this container runtime with VS Code IDE. Use the "remoteUser" property in
# devcontainer.json to use it. More info on VS Code remote development in
# container check https://code.visualstudio.com/docs/remote/remote-overview for
# details.
ARG USERNAME=vscode
ARG USER_UID=1000
ARG USER_GID=$USER_UID

# This hack is widely applied to avoid python printing issues in docker
# containers. See:
# https://github.com/Docker-Hub-frolvlad/docker-alpine-python3/pull/13
ENV PYTHONUNBUFFERED=1

### Install Workstation Software
RUN addgroup -g $USER_GID -S $USERNAME \
  && adduser -u $USER_UID -S $USERNAME -G $USERNAME  \
  && cd /tmp \
  && apk update \
  && echo "**** Installing Utilities ****" \
  && apk add --no-cache curl dpkg git ca-certificates jq bash-completion \
  && echo "**** Installing nodejs ****" \
  && apk add --update nodejs \
  && apk add --update npm \
  && echo "**** Cleanup ****" \
  && rm -Rf /tmp/*

WORKDIR /root/docs

CMD [ "/bin/bash" ]