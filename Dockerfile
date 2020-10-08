FROM openjdk:latest
EXPOSE 8080
ADD target/hulu_user_springboot_docker.jar /docker/hulu_user
ENTRYPOINT ["java", "-jar", "/Hulu_user_Springboot_Docker.jar"]