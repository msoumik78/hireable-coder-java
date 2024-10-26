# Functionality : Spring boot app which demonstrates how to protect some endpoints selectively
Simple spring boot app which demonstrates how to protect some endpoints selectively while keeping other endpoints open


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring security to do basic authentication


# How to run locally
- Clone this branch (spring-boot-basic-security2) to your laptop with the below command:
  (`git clone --branch spring-boot-basic-security2 https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-security-demo-0.0.1-SNAPSHOT.jar`)
- Access the public endpoint using the below command:
  (`curl http://localhost:8085/api/1/public`)
- Now try to access the private endpoint as below but you should get a Http 401:
  (`curl http://localhost:8085/api/1/private`)
- Now again try to access the private endpoint and it should be successful:
  (`curl -H "Authorization:Basic dGVzdDEyOnBhc3N3b3JkMTIz" http://localhost:8085/api/1/private`)

