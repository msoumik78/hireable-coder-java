# Functionality : Spring boot app which demonstrates multiple filter chains for multiple endpoints
Simple spring boot app which demonstrates multiple filter chains applied for multiple endpoints



# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring security to do authentication


# How to run locally
- Clone this branch (spring-boot-basic-security4) to your laptop with the below command:
  (`git clone --branch spring-boot-basic-security4 https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-security-demo-0.0.1-SNAPSHOT.jar`)
- Now access the private endpoint /api/1/private with the Http basic header:
  (`curl -H "Authorization:Basic dGVzdDEyOnBhc3N3b3JkMTIz" http://localhost:8085/api/1/private`)
- But you can access the other private endpoint (/api/2/private) without the basic header:
    (`curl http://localhost:8085/api/2/private`)

