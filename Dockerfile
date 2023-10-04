# Use a base image with Maven and Java pre-installed
FROM maven:3.8.4-openjdk-11-slim AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the project's POM and source code files into the container
COPY pom.xml .
COPY src ./src

# Build the Spring Boot application
RUN mvn clean install

# Create a minimal runtime image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the runtime container
WORKDIR /app

# Copy the JAR file from the builder stage to the runtime container
COPY --from=builder /app/target/your-application.jar ./app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]
