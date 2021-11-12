# Recipes Service

Simple SpringBoot service which queries/uploads recipes to MongoDB.

## Development Setup

Pre-requisite:
- Gradle 5
- Java 11

1. Setup MongoDB
    - If installing and running locally, follow these steps: https://docs.mongodb.com/guides/server/install/
    - If mongodb is already installed, change the existing `application.properties` file's property `spring.data.mongodb.uri`
2. Clone/fork this repository
3. Once MongoDB is set up locally or configured to point at your installation elsewhere, you should be able to run a `gradle clean build`

