FROM ubuntu:latest
LABEL authors="nandoaltz"
WORKDIR app
COPY
ENTRYPOINT ["top", "-b"]