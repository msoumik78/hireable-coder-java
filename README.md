# Functionality : Spring boot app which demonstrates basic spring security
Simple spring boot app which demonstrates basic spring security


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring security to do basic authentication


# How to run locally
- Clone this branch (spring-boot-read-properties) to your laptop with the below command:
  (`git clone --branch spring-boot-basic-security https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-security-demo-0.0.1-SNAPSHOT.jar`)
  Now it should log/print a password in the console.
  Copy the password and use it in the CreateCredentials.java class and run it to generate the base 64 encoded version.
- You can access the endpoint using the command below (replace the token with the one generated above):
  (`curl -H "Authorization:Basic dGVzdDEyOnBhc3N3b3JkMTIz" http://localhost:8085/api/1/config`)

