FROM openjdk
ADD target/config-service.jar config-service.jar
ENTRYPOINT ["java", "-jar", "/config-service.jar"]
EXPOSE 8761