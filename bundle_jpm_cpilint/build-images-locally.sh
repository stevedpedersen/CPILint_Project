#!/bin/bash

# This script can be used to build all local docker images needed for EAT Jenkins with an appropriate tag.
# It will scan the container.yaml files in _scm_container, extract the image name and first tag and build/tag it locally

# this can be used in combination with the values.local.yaml file to build images locally and test locally

set -e

IMAGE_FOLDERS=(_scm_container/jpmJenkins _scm_container/jpmJenkinsDockerWorker _scm_container/jpmJenkinsK8sDockerWorker _scm_container/jpmJenkinsK8sWorker _scm_container/jpmJenkinsWorker _scm_container/jpmDockerStableDinD)

for IMAGE_FOLDER in ${IMAGE_FOLDERS[@]}; do
  echo "Build local docker image [$IMAGE_FOLDER]"
  NAME=$(yq read $IMAGE_FOLDER/container.yaml name)
  TAG=$(yq read $IMAGE_FOLDER/container.yaml tags[0])
  echo "  Will tag as $NAME:$TAG"
  docker build -t $NAME:$TAG $IMAGE_FOLDER
done
