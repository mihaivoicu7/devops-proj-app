FROM openjdk:11.0.8-jdk
COPY target/hospitalmanager-connector-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]