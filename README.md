# Functionality : Demo of performance of native-image vs class files
This repo contains simple programs and steps to run them as java classes and then to run them as a native binaries (compiled using GraalVM).
Purpose is to demonstrate the performance gain that can be obtained using native images created by GraalVM. 


# Technical details and Pre-requisites
- Requires GraalVM which can be downloaded from [here](https://www.graalvm.org/downloads/). Ensure that you download the version corresponding to your OS
- Once you have downloaded GraalVM, ensure that the bin folder is in the PATH environment variable
- You can also refer [here](https://www.graalvm.org/latest/getting-started/) for additional info on GraalVM


# How to run locally
- First compile the program ForLoopDemo using the below command and using the GraalVM compiler:
  (`javac ForLoopDemo.java`)
- Then create a native image from the .class file using the below command. This command should create a binary named 'forLoopDemo'
  (`native-image ForLoopDemo`)
- Then run the .class file using the command:
  (`java ForLoopDemo`)
- Now run the native image using the below command:
  (`./forLoopDemo`)
- Follow similar steps for the other java class named HashingDemo.java