FROM openjdk
ADD target/account-service.jar account-service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "/account-service.jar"]
EXPOSE 8080