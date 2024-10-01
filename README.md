# Functionality : Demo of mmap to read a file
Simple java standalone class which demonstrates usage of mmap (memory map) to read a large file.


# Technical details and Pre-requisites
- Written using core java.


# How to run locally
- Clone this branch (mmap-demo) to your laptop using the command below :
  (`git clone --branch mmap-demo https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven 3.8.5 available and set in the PATH
- Open the class FileReaderDemo and modify the fileName variable in the main method to reflect an existing path in your OS
- Build the project using the command :
  (`mvn clean package`)
- Now run the program using the command :
  (`mvn exec:java  -Dexec.mainClass="com.example.demo.FileReaderDemo"`)
