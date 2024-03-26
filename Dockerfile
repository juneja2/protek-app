# Get Maven using JDK 17 to manage build dependencies
FROM maven:3.9.6-eclipse-temurin-17

# Copy necessary files to the container
WORKDIR /app
COPY src /app/src
COPY ./pom.xml /app/pom.xml

# Run unit tests with Maven when launching the docker container
CMD mvn clean test