FROM openjdk:8-jdk-alpine
ADD target/project-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT ["java","-jar","/app.war", "--spring.profiles.active=docker"]