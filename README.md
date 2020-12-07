# Getting Started

## Requirements
### Setup your IDE
https://www.baeldung.com/lombok-ide

Java 15

Gradle 6.6+

## Usage examples
`curl -v 'http://localhost:9988/getInfo'`

`curl -v 'http://localhost:9988/message'`

## Build and run replicated
`gradlew bootRun`

### TODO
Add Spring Cloud Bus

### Spring Initializr recipe
https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.0.RELEASE&packaging=jar&jvmVersion=15&groupId=com.fdobrotv&artifactId=client_service&name=client_service&description=Base%20microservice%20(client)%20service%20of%20the%20Spring%20Cloud%20ecosystem&packageName=com.fdobrotv.client_service&dependencies=cloud-config-client,cloud-eureka,cloud-starter-sleuth,cloud-loadbalancer,cloud-feign