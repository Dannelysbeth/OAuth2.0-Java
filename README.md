# OAuth2 Login with GitHub and Google

This Spring Boot application provides a simple demonstration of OAuth2 login with GitHub and Google. The application features basic authentication and authorization setups using Spring Security.

## Overview

The application includes:
- A simple REST API with unsecured and secured endpoints.
- OAuth2 login configuration for GitHub and Google.
- Basic security configuration using Spring Security.

## Features

- **Public Access:** The root endpoint (`/`) is publicly accessible.
- **Secured Access:** The `/secured` endpoint requires authentication.
- **OAuth2 Integration:** Supports login via GitHub and Google.

## Configuration
Create a file named `application.properties` in the `src/main/resources directory` with the following content:

````
# GitHub Login Configuration
spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET

# Google Login Configuration
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET

# Logging Level
logging.level.org.springframework.security=TRACE

````

## Accessing the Application
- **Public Endpoint:** Navigate to http://localhost:8080/ to see the "Hello world" message.
- **Secured Endpoint:** Navigate to http://localhost:8080/secured. You will be prompted to log in via GitHub or Google if you are not authenticated.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
