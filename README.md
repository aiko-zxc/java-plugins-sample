# java-plugins-sample

This project is a template for module-structured java projects (both maven and gradle) with configured important plugins:
+ checkstyle - analyses code for mismatches in coding standard.
+ spotless - applies code formatting according to coding standard.
+ spotbugs - analyses for bugs in java code.
+ jacoco - code coverage tool with required coverage %.

## Gradle
Project contains gradle wrapper.

Gradle project also contains following plugins:
+ sonarqube - automatic code review tool that systematically helps you deliver clean code.
+ asciidoc - generate pdf, html documentation.
+ dependencycheck - detects vulnerabilities in dependencies.

Run `./gradlew clean build` to build the project.

## Maven
Project contains maven wrapper.
Currently, maven project doesn't have sonarqube, asciidoc, dependencycheck configuration.

Run `./mvnw clean install` to build the project.
