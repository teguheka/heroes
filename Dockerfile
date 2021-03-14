## BUILD EXECUTABLE stage 1 ##
FROM openjdk:8-jdk-alpine AS builder
WORKDIR /usr/build
COPY src src
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw package -DskipTests

## EXECUTE APPLICATION stage 2 ##
FROM openjdk:8-jdk-alpine
WORKDIR /usr/app
COPY --from=builder /usr/build/target/heroes.jar heroes.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","heroes.jar"]