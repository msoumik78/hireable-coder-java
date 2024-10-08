# Functionality : Demo of awaitility library
Demo of awaitility library to test the HttpClient code asynchronously.


# Technical details and Pre-requisites
- Written using core java.
- Leverages [awaitility library](http://www.awaitility.org/) to test the HttpClient code
- A REST endpoint is up and running in Mockoon platform


# How to run locally
- Clone this branch (awaitility-demo) to your laptop using the below command :
  (`git clone --branch awaitility-demo https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Now start Mockoon so that a GET endpoint is available at http://localhost:3000/users
- Now build the project and run the test using the command:
  (`mvn clean package`)
