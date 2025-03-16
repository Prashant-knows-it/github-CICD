FROM openjdk:21-jdk-slim  
WORKDIR /app  
COPY target/github_cide_integration.jar app.jar  
EXPOSE 8080  
ENTRYPOINT ["java", "-jar", "/app/app.jar"]  
