# Functionality : Lombok usage in standalone java class
Simple java standalone class which uses lombok to generate constructors, setters, getters, ToString, Log , builders etc..


# Technical details and Pre-requisites
- Written using core java.
- Uses Lombok


# How to run locally
- Clone this branch (lombok-usage) to your laptop using the command below :
  (`git clone --branch lombok-usage https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available and set in the PATH
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command which starts the app with 'test' profile:
  (`mvn exec:java  -Dexec.mainClass="com.example.demo.DemoApplication"`)
