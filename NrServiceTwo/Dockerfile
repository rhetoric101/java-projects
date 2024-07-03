# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project JAR file into the container at /app
COPY target/nrservicetwo-1.0-SNAPSHOT.jar /app/nrservicetwo.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/nrservicetwo.jar"]


