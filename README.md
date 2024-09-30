# Functionality : Standalone Java programs implementing hashing using Argon2
Simple java standalone programs which implement hashing using argon2 algorithm.


# Technical details and Pre-requisites
- Written using core java.
- One approach uses a JVM-bind which is [here](https://github.com/phxql/argon2-jvm)
- Another approach uses spring-security-crypto and bouncy castle as the provider


# How to run locally
- Clone this branch (nats-publisher) to your laptop using the command
  (`git clone --branch hashing-demo https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`mvn exec:java  -Dexec.mainClass="com.example.demo.HashingUsingArgonDirectly"`)
- Now again run the app using the below command :
    (`mvn exec:java  -Dexec.mainClass="com.example.demo.HashingUsingSpringSecurityCrypto"`)
