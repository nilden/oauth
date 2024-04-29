# OAuth2 API Gateway

This is a Spring Boot application named "OAuth2ApiGateway". It serves as an API Gateway for microservices and uses OAuth2 for authentication.

## Features

- **API Gateway**: The application uses Spring Cloud Gateway to route requests to appropriate microservices. The routing configuration can be found in the `application.yml` file.

- **OAuth2 Authentication**: The application uses Spring Security's OAuth2 client support for authentication. It is currently configured to use Azure as the Identity Provider (IdP), but it can be easily reconfigured to use other IdPs like Google.

- **Token Relay**: The application includes a token relay feature, which forwards the JWT from the API Gateway to the downstream services.

## Technologies Used

- **Spring Boot**: The application uses Spring Boot, which is an open-source Java-based framework used to create stand-alone, production-grade Spring-based Applications.

- **Spring Cloud Gateway**: An intelligent and programmable router based on Project Reactor.

- **Spring Security**: A powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.

- **Maven**: A build automation tool used primarily for Java projects.

## Setup and Run

To run this application, you need to have Java and Maven installed on your machine.

1. Clone the repository: `git clone https://github.com/nilden/OAuth2ApiGateway.git`
2. Navigate to the project directory: `cd OAuth2ApiGateway`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

The application will start running at `http://localhost:9000`.

## Code Structure

- `ApiGatewayApplication.java`: This is the main class that includes the main method which is the entry point of the JVM to start the Spring Boot application.

- `AuthController.java`: This class is a Rest Controller which has a GET endpoint for testing the authentication.

- `application.yml`: This file contains the application's default configuration.

- `pom.xml`: This file contains all the project dependencies and plugins.

## Security

This application uses OAuth2 for authentication. The OAuth2 client details are configured in the `application.yml` file. Please make sure to replace the client-id and client-secret with your own.