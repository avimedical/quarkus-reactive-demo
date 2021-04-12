#!/bin/bash

docker-compose -f ./tools/docker-compose.yaml rm -f

docker build -t quarkus-reactive-demo-flyway ./flyway
docker-compose -f ./tools/docker-compose.yaml up
