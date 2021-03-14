FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} heroes.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/heroes.jar"]