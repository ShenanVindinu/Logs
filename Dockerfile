FROM openjdk:21-jdk-slim

# app - customizable name
ADD target/hello.jar app.jar


# Expose the port that app will run on container
EXPOSE 8080


# Run the spring boot application
ENTRYPOINT ["java","-jar","app.jar"]