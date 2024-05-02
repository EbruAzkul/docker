From openjdk:17-alpine
EXPOSE 8080
ADD target/docker.jar docker.jar
ENTRYPOINT ["java","-jav","docker.jar"]