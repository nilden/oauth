# OAuth Multi-Module Project

This is a multi-module Maven project consisting of two modules: `api-gateway` and `resource-server`. The project uses Spring Boot and OAuth2 for authentication.

## Modules

### API Gateway

The `api-gateway` module acts as a gateway for all incoming requests and forwards them to the appropriate services.

### Resource Server

The `resource-server` module is an OAuth2 resource server. It expects incoming requests to include a valid JWT (JSON Web Token) for authentication.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 21
- Maven

### Installing

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn install` to build the project

## Running the Application

You can run the application using the following command in the terminal:

```bash
mvn spring-boot:run