# Getting Started

## Requirements
### Setup your IDE
https://www.baeldung.com/lombok-ide

Java 15

Gradle 6.6+

### Host name aliases in hosts file
cat `127.0.0.1 client-service-1.com
127.0.0.1 client-service-2.com
127.0.0.1 client-service-3.com` >> /etc/hosts

## Usage examples
`curl -v 'http://localhost:9988/getInfo'`

`curl -v 'http://localhost:9988/message'`

## Build and run

### By docker-compose with discovery - REPLICATED
1 - Run `docker-compose up` of https://github.com/fdobrotv/springDiscoveryService
2 - Run `docker-compose up` of https://github.com/fdobrotv/springConfigurationService
3 - Run `docker-compose up` of https://github.com/fdobrotv/springCloudGateway

4 - `docker-compose up`

### Standalone
`gradlew bootRun`

### TODO
Add Spring Cloud Bus

### Spring Initializr recipe
https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.0.RELEASE&packaging=jar&jvmVersion=15&groupId=com.fdobrotv&artifactId=client_service&name=client_service&description=Base%20microservice%20(client)%20service%20of%20the%20Spring%20Cloud%20ecosystem&packageName=com.fdobrotv.client_service&dependencies=cloud-config-client,cloud-eureka,cloud-starter-sleuth,cloud-loadbalancer,cloud-feign