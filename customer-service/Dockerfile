FROM openjdk
ADD target/customer-service.jar customer-service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "/customer-service.jar"]
EXPOSE 8080