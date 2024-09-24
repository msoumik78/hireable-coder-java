# Functionality : Spring boot app which reads encrypted properties from application.yml file
Simple spring boot app which reads encrypted properties from application.yml file.


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages [jasypt spring-boot plugin](https://github.com/ulisesbocchio/jasypt-spring-boot)


# How to run locally
- Clone this branch (spring-boot-read-encrypted-properties) to your laptop with the below command:
  (`git clone --branch spring-boot-read-encrypted-properties https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- First encrypt a property using the below command where the encryptor password is kolkata and the value of the property is password123:
  (`mvn jasypt:encrypt-value -Djasypt.encryptor.password=kolkata -Djasypt.plugin.value=password123`)
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar -Djasypt.encryptor.password=kolkata target/spring-boot-read-encrypted-properties-0.0.1-SNAPSHOT.jar`)
- You can access the endpoint using the command and it should return "password123":
  (`curl http://localhost:8085/api/1/config`)

