FROM quay.io/quarkus/ubi-quarkus-mandrel-builder-image:23.0.1.2-Final-java17-amd64

USER root
RUN microdnf install make findutils
USER quarkus

ENV QUARKUS_DEVSERVICES_ENABLED=false

ENTRYPOINT /bin/bash