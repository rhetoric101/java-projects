# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Install curl and net-tools
RUN apt-get update && apt-get install -y curl net-tools

# Set the working directory
WORKDIR /app

# Copy the project JAR file into the container at /app
COPY target/otelserviceone-1.0-SNAPSHOT.jar /app/otelserviceone.jar

# Add the OpenTelemetry Java agent JAR
COPY target/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar

# Make port 8080 available to the world outside this container
EXPOSE 8083

# Run the jar file
# old ENTRYPOINT ["java", "-jar", "/app/otelserviceone.jar"]

ENTRYPOINT ["java", "-javaagent:/app/opentelemetry-javaagent.jar", "-jar", "/app/otelserviceone.jar"]