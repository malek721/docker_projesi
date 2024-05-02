FROM openjdk:17-alpine
EXPOSE 8085
ADD target/docker-proje.jar docker-proje.jar
ENTRYPOINT ["java", "-jar", "docker-proje.jar"]