FROM openjdk:15-jdk-alpine
EXPOSE 8080
ADD ./target/spring-demo-1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]