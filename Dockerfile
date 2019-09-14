FROM openjdk:8
add target/docker-demo-service.jar docker-demo-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-demo-service.jar"]