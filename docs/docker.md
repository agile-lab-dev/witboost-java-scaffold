# Running with Docker

You can use the below instructions if you want to run your app as a docker image.


### Build Docker image

```bash
docker build -t java-specific-provisioner .
```

### Container execution

At this point, we can run the docker image as a container via the `run` command and the name associated with the image during the build. This automatically enables OpenTelemetry automatic instrumentation:


```bash
docker run -d --name java-sp-container -p 8888:8888 java-specific-provisioner
```

However, for OpenTelemetry to work correctly, some environment variables need to be set in order to send collected data to an **Observability backend** (e.g. Prometheus).

- If you already have a Collector up and running, replace `<CollectorURL>` with its URL (e.g. `http://172.20.0.1:5555`).

```bash
docker run -d --name java-sp-container \
-e OTEL_EXPORTER_OTLP_ENDPOINT=<CollectorURL> \
-e OTEL_METRICS_EXPORTER=otlp \
-e OTEL_SERVICE_NAME=java-scaffold \
-e OTEL_TRACES_EXPORTER=otlp \
-p 8888:8888 java-specific-provisioner
```

- If you are running the collector in your local host (for example, by running the provided [docker-compose file](opentelemetry.md)) then you can replace `<CollectorURL>` with the hostname address, and the final command will look like the following:

```bash
docker run -d --name java-sp-container \
-e OTEL_EXPORTER_OTLP_ENDPOINT=http://$(hostname -f):5555 \
-e OTEL_METRICS_EXPORTER=otlp \
-e OTEL_SERVICE_NAME=java-scaffold \
-e OTEL_TRACES_EXPORTER=otlp \
-p 8888:8888 java-specific-provisioner
```
