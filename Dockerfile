FROM openjdk:8-jdk
COPY target/springboot-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java", "-jar", "/app.jar"]