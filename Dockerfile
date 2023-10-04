# Use the official maven/Java 8 image to create a build artifact.
FROM maven:3.6-jdk-8-slim AS build

# Set the working directory in docker
WORKDIR /app

# Copy the pom.xml file to download dependencies
COPY pom.xml .

# Download the dependencies
RUN mvn dependency:go-offline -B

# Copy the entire project and build it
COPY src /app/src
RUN mvn package -DskipTests

# Use OpenJDK to run the built artifact
FROM openjdk:8-jre-slim

# Set the working directory in docker
WORKDIR /app

# Copy the jar file built in the first stage
COPY --from=build /app/target/*.jar app.jar

# Command to run the application
CMD ["java", "-jar", "app.jar"]