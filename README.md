# Functionality : Demonstrates how plugins work in maven using a sample plugin (Checkstyle)
Simple maven project which demonstrates how plugins work in the maven architecture.


# Technical details and Pre-requisites
- Written using core java and maven


# How to run locally
- Clone this branch (maven-plugin-demo) to your laptop with the below command:
  (`git clone --branch maven-plugin-demo https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Run checkstyle check and it will fail with errors:
  (`mvn checkstyle:check`)
- Now try to compile the app and again it will fail at checkstyle issues :
  (`mvn clean compile`)
- Now try to get more details about checkstyle plugin :
  (`mvn help:describe -DartifactId=maven-checkstyle-plugin -DgroupId=org.apache.maven.plugins -Dgoal=check -Ddetail`)

