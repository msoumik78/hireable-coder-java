# Functionality : Spring boot app deployed to AWS lambda
Simple spring boot app which is deployed to AWS lambda


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Deployed to AWS Lambda. Refer to this [guide](https://github.com/aws/serverless-java-container/wiki/Quick-start---Spring-Boot3) for details.



# How to build locally
- Clone this branch (spring-boot-aws-lambda) to your laptop with the below command:
  (`git clone --branch spring-boot-aws-lambda https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command and this should create a zip file in the target folder:
  (`mvn clean package`)


# How to deploy to AWS lambda
- Login to AWS management console and navigate to Lambda
- Opt for creating a function ansd give a function name and also choose Java21 as the runtime
- Once the function is created, go to the 'Code' tab & upload the built zip file from local
- Then opt for editing runtime settings and provide the below in the Handler field :
  com.example.demo.StreamLambdaHandler::handleRequest


# How to test the AWS lambda
- Go to the 'Test' tab and choose 'API Gateway AWS Proxy' as the template
- Update the below fields of the event json :
  "path": "/api/1/config",
  "httpMethod": "GET",
- Now save the json and click the 'Test' button to send a request to Lambda which should take a few seconds but should be successful

