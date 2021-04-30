# Spring-boot Person Application

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) application. This app adds, edit, delete and search for persons 
in the database

## [Requirements]

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.6.3](https://maven.apache.org)
- [Postgres 13](https://www.postgresql.org/)

## [Technology stack]
* Spring Boot 2;
* PostgreSQL database;
* Swagger;


## [ Database Configuration]
````
server.port = 8888
spring.main.banner-mode=off
logging.level.org.springframework=ERROR

spring.jpa.hibernate.ddl-auto=none
server.servlet.context-path=/

spring.datasource.initialization-mode=always
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/persons
spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
 ````

## [Running the application locally]

You can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

Build the project using:

```shell
mvn clean install
```

## [The view in the Swagger]
http://localhost:8888/swagger-ui/

## [The view in the Postman] 
http://localhost:8888/persons

This app runs on 8888 port.