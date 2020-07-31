Spring Web Flow JSF Integration
=============================================

This project aims to present how to connect JSF and Spring WebFlow.

Libraries
---------------------------------------------
- JSF
- Spring

Requirements
---------------------------------------------
- [Java JDK](https://www.oracle.com/pl/java/technologies/javase-downloads.html) version 8+

How to run application
---------------------------------------------
On Windows
```bash
## Build application from base directory using Maven Wrapper
mvnw.cmd clean install

## Run tomcat7 server and deploy the application
mvnw.cmd tomcat7:run-war

## Application should be accessible at
http://localhost:8081/spring-webflow-jsf-integration
```

On MacOS/ Linux
```bash
## Build application from base directory using Maven Wrapper
./mvnw clean install

## Run tomcat7 server and deploy the application
./mvnw tomcat7:run-war

## Application should be accessible at
http://localhost:8081/spring-webflow-jsf-integration
```
