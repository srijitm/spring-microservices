FROM openjdk
ADD target/customer-service.jar customer-service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "/customer-service.jar"]
EXPOSE 8080