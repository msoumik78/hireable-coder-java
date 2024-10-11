# Functionality : Demonstration of logging in a spring boot app
Demonstration of logging in a spring boot application


# Technical details and Pre-requisites
- Written using core java and spring boot framework


# How to run locally
- Clone this branch (spring-boot-logging) to your laptop with the below command:
  (`git clone --branch spring-boot-logging https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app in non-local mode using the below command :
  (`java -jar target/spring-boot-logging-0.0.1-SNAPSHOT.jar`)
- You can access the endpoint using the below command and it should return "Test message" and also create a log file named hireable-coder.log and log a line there for each request:
  (`curl  http://localhost:8085/api/1/config`)
- Now run the app in local mode using the below command :
    (`java -jar -Dspring.profiles.active=local target/spring-boot-logging-0.0.1-SNAPSHOT.jar`)
- You can access the endpoint using the below command and it should return "Test message in local" and also log to the console (will not log to the file):
  (`curl  http://localhost:8085/api/1/config`)
- Use the below command to know the log level in the controller class:
  (`curl http://localhost:8085/actuator/loggers/com.example.demo.controller.BasicController`)
- Use the below command to change the log level in the controller class:
  (`curl -H 'Content-Type: application/json'  -d '{"configuredLevel": "ERROR"}' -X POST http://localhost:8085/actuator/loggers/com.example.demo.controller.BasicController`)


