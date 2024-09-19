# Functionality : Standalone NATS producer
Simple java standalone application which can publish a message to a specific subject in NATS messaging platform. 


# Technical details and Pre-requisites
- Written using core java.
- Uses NATS library to make a connection and publish messages
- Ensure that you have downloaded NATS for your OS and started the NATS server locally. NATS can be downloaded from [here](https://github.com/nats-io/nats-server/releases/) corresponding to your OS.


# How to run locally
- Clone this branch (nats-publisher) to your laptop
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command which starts the app with 'test' profile:
  (`mvn exec:java  -Dexec.mainClass="com.example.demo.DemoApplication"`)
