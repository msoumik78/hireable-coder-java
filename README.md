# Functionality : Demonstrates some sample plugins and how to configure them
Simple maven project which demonstrates the usages of the following plugins:
  - compiler plugin : can be used to compile java sources against various target JDK versions (21, 17, 15, 11)
  - pmd plugin : can be used to check bugs in code



# Technical details and Pre-requisites
- Written using core java and maven
- Assumes that you have JDK21 installed and being used for maven builds


# How to run locally to
- Clone this branch (maven-plugin-customization) to your laptop with the below command:
  (`git clone --branch maven-plugin-customization https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven 3.8.5 available
- Ensure that you have the property named maven.compiler.release set to 21 as follows within properties section in pom.xml
  (`<maven.compiler.release>21</maven.compiler.release>`)
- Now compile the code using the command :
  (`mvn clean compile`)
- Verify that the compiled code has major version of 65 by running the command and verifying the output:
  (`javap -verbose target.classes.com.example.demo.App`)
- Now again reset the property named maven.compiler.release to say 11 as follows within properties section in pom.xml
    (`<maven.compiler.release>11</maven.compiler.release>`)
- Now compile the code using the command :
  (`mvn clean compile`)
- Verify that the compiled code has major version of 55 by running the command and verifying the output:
  (`javap -verbose target.classes.com.example.demo.App`)

