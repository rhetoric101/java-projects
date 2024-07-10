# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project JAR file into the container at /app
COPY target/nrservicetwo.jar /app/nrservicetwo.jar

# Copy the New Relic agent into the container
COPY target/newrelic/newrelic.jar /app/newrelic.jar
COPY target/newrelic/newrelic.yml /app/newrelic.yml

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-javaagent:/app/newrelic.jar", "-Dnewrelic.config.file=/app/newrelic.yml", "-jar", "/app/nrservicetwo.jar"]



