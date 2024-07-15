# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Install curl and net-tools
RUN apt-get update && apt-get install -y curl net-tools

# Set the working directory
WORKDIR /app

# Copy the project JAR file into the container at /app
COPY target/otelservicetwo-1.0-SNAPSHOT.jar /app/otelservicetwo.jar

# Add the OpenTelemetry Java agent JAR
COPY target/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar

# Set environment variables for OpenTelemetry
# Reminder: You don't need to set the environement varaibles here.
# Just pass them in on the Docker run command!

# Make port 8082 available to the world outside this container
EXPOSE 8082

# Run the jar file
# Original: ENTRYPOINT ["java", "-jar", "/app/otelservicetwo.jar"]

# Add the OTel Java agent to the Java command
ENTRYPOINT ["java", "-javaagent:/app/opentelemetry-javaagent.jar", "-jar", "/app/otelservicetwo.jar"]
