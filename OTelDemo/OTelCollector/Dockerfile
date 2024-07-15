FROM ubuntu:20.04

# Install necessary packages including curl, bash, and ca-certificates
RUN apt-get update && apt-get install -y curl bash ca-certificates && rm -rf /var/lib/apt/lists/*

# Download and install OpenTelemetry Collector
RUN curl -sSL https://github.com/open-telemetry/opentelemetry-collector-releases/releases/download/v0.40.0/otelcol_0.40.0_linux_amd64.tar.gz | tar -xz -C /usr/local/bin

# Add the OpenTelemetry Collector configuration file
COPY otel-collector-config.yml /etc/otel-collector-config.yml

# Set entrypoint to run the OpenTelemetry Collector with the provided configuration
ENTRYPOINT ["/usr/local/bin/otelcol", "--config", "/etc/otel-collector-config.yml"]

