# Resource Server

This is a Spring Boot application that serves as a resource server. It is designed to work with OAuth2 for authentication and authorization.

## Features

- OAuth2 Resource Server: The application is configured as an OAuth2 resource server. It expects incoming requests to include a valid JWT (JSON Web Token) for authentication.

- Security: The application uses Spring Security to handle security concerns, including the validation of incoming JWTs.

## Dependencies

The application uses the following dependencies:

- `spring-boot-starter-oauth2-resource-server`: This dependency provides the necessary libraries for setting up an OAuth2 resource server.

- `spring-boot-starter-security`: This dependency provides the core Spring Security libraries.

- `spring-boot-starter-web`: This dependency provides the libraries needed to build a web application, including RESTful applications, using Spring MVC. It uses Tomcat as the default embedded container.

## Configuration

The application's configuration is located in the `application.yml` file. Here, you can specify the issuer URI and the JWK Set URI for JWT validation.

```yaml
spring:
  security:
    oauth2:
      resourceserver:
        jwt:
          issuer-uri: https://login.microsoftonline.com/${TENANT_ID}/v2.0
          jwk-set-uri: https://login.microsoftonline.com/${TENANT_ID}/discovery/v2.0/keys
```

Replace `${TENANT_ID}` with your Microsoft Azure Active Directory tenant ID.

## Build & Run

The application uses Maven as a build tool. You can build and run the application using the following command:

```bash
mvn spring-boot:run
```

This will start the application on port 8080.

## Security

Please ensure that you handle your tenant ID and any other sensitive information securely. Do not commit sensitive information to your version control system.