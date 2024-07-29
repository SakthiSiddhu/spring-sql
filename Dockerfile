FROM eclipse-temurin:17-jdk-focal
EXPOSE 9090
ADD target/Springboot-docker-jenkins-0.0.1-SNAPSHOT.jar Springboot-docker-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Springboot-docker-0.0.1-SNAPSHOT.jar"]