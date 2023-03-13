# Use an official maven runtime as a parent image
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory to /app
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml .

# Download the dependencies specified in the pom.xml file
RUN mvn dependency:go-offline

# Copy the rest of the application code to the container
COPY src ./src

# Build the application using Maven
RUN mvn package

# Use an official openjdk runtime as a parent image
FROM openjdk:17-jdk-alpine3.14

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file from the build stage to the container
COPY --from=build /app/target/<application_name>.jar .

# Run the application when the container starts
CMD ["java", "-jar", "<application_name>.jar"]
