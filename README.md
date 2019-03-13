# Spring Microservices Project

This repository contains two microservices Accounts (account-service) and Customers (customer-service) which register themselves on Eureka (discovery-service). Zuul (gateway-service) acts as an API gateway.

The project comes with individual Dockerfiles per service and a docker-compose configuration to orchestrate the entire application on local machines.

**This was developed on a mac (with Docker for Mac).**
 >From 18.03 onwards our recommendation is to connect to the special DNS name host.docker.internal, which resolves to the internal IP address used by the host.

See: <https://docs.docker.com/docker-for-mac/networking/>

*Make sure to update the DNS name if not working on a Mac*

## Localhost Instructions

*Of course you need jdk, maven etc. installed prior to this*

1. `cd ./spring-microservices`
2. `mvn clean install`
3. `docker-compose build`
4. `docker-compose up`
5. Browse to <http://localhost:8761/> to validate Eureka is up and services have registered.
6. `curl <http://localhost:8765/api/customer/customers>` to hit the Zuul endpoint.
7. `docker-compose scale account-service=2 customer-service=2` to scale the services up. Check Eureka to see if they have registered. Hit the API endpoint again and monitor logs to see the calls are being load balanced to both instances of account and customer services.