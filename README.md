# Functionality : Spring boot app which demonstrates basic spring security with users in embedded H2 database
Simple spring boot app which demonstrates basic spring security with users in embedded H2 database


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring security to do basic authentication based on an user credential


# How to run locally
- Clone this branch (spring-boot-security-using-jdbc) to your laptop with the below command:
  (`git clone --branch spring-boot-security-using-jdbc https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-security-with-h2-database-0.0.1-SNAPSHOT.jar`)
- You can access the endpoint using the command below :
  (`curl -H "Authorization:Basic dGVzdDpwYXNzd29yZDEyMw==" http://localhost:8085/api/1/config`)

