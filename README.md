# Functionality : Spring boot app which demonstrates how the filter list can vary
Simple spring boot app which demonstrates how the filter list can vary.
So in this demo, we have added an Oauth verification skeleton which increases the number of filters.
So the list of filters can vary.



# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring security to do authentication


# How to run locally
- Clone this branch (spring-boot-basic-security3) to your laptop with the below command:
  (`git clone --branch spring-boot-basic-security3 https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-security-demo-0.0.1-SNAPSHOT.jar`)
- Now access the private endpoint and it should be successful:
  (`curl -H "Authorization:Basic dGVzdDEyOnBhc3N3b3JkMTIz" http://localhost:8085/api/1/private`)

