# Functionality : Standalone JWT creation and validation using nimbus library
Simple java standalone application which creates and validates JWT .


# Technical details and Pre-requisites
- Written using core java and using [nimbus library](https://connect2id.com/products/nimbus-jose-jwt) .


# How to run locally
- Clone this branch (jwt-demo) to your laptop:
  (`git clone --branch jwt-demo https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command which starts the app with 'test' profile:
  (`mvn exec:java  -Dexec.mainClass="com.example.demo.CreateAndVerifyJWT"`)
