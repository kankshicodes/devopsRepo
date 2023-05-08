#define base docker image
FROM openjdk:11
EXPOSE 5000
#LABEL maintainer="adarshdocker"
ADD target/jenkins-docker-image.jar jenkins-docker-image.jar
ENTRYPOINT ["java","-jar", "jenkins-docker-image.jar"]