FROM openjdk:8-jdk-alpine
WORKDIR /usr/scr/app
COPY target/*.jar application.jar
ENTRYPOINT ["java","-jar","/application.jar"]
