# Spring-boot Person Application

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) application. This app adds, edit, delete and search for persons 
in the database

## [Requirements]

For building and running the application you need:

- [JDK 16.0.1](https://download.oracle.com/otn-pub/java/jdk/16.0.1+9/7147401fd7354114ac51ef3e1328291f/jdk-16.0.1_windows-x64_bin.exe)
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

spring.jpa.hibernate.ddl-auto=create
server.servlet.context-path=/
spring.jpa.show-sql=true

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

Build runnable jar-packaged: 

```shell
mvn clean install
```
``` shell
java -jar persons-0.0.1-SNAPSHOT.jar
```

## [The view in the Swagger]
http://localhost:8888/swagger-ui/

## [The view in the Postman] 
http://localhost:8888/persons

This app runs on 8888 port.
