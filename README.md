# Functionality : Spring boot app which reads properties from application.yml file
Simple spring boot app which reads properties from application.yml file


# Technical details and Pre-requisites
- Written using core java and spring boot framework


# How to run locally
- Clone this branch (spring-boot-read-properties) to your laptop with the below command:
  (`git clone --branch spring-boot-read-properties https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-read-properties-0.0.1-SNAPSHOT.jar`)
- You can access the endpoint using the command and it should return "Test message":
  (`curl http://localhost:8085/api/1/config`)

