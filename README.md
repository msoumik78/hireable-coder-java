# Functionality : Spring boot app which demonstrates basic spring security with users in external MySQL database
Simple spring boot app which demonstrates basic spring security with users in external MySQL database


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring security to do basic authentication based on an user credential
- Create a docker container for MySQL database with the below shell script
  ```kotlin
  docker kill $(docker ps -q)
  docker rm -vf $(docker ps -aq)
  docker volume rm $(docker volume ls -q)
  docker rmi -f $(docker images -aq)
  docker run --name soumik-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql
  ```
- Once the above script is run and the MySQL container is started, please enter the container with the below command (provide the password in the second prompt) :
  ```kotlin
  docker exec -it soumik-mysql mysql -uroot -p
  ```
- Then create the database with the below command :
  (`create database testusers`)
- Then enter the new database created using the below command :
  (`use testusers`)
- Then execute the below queries to create the 2 tables:
  ```kotlin
  create table users(username varchar(50) not null primary key, password varchar(500) not null, enabled boolean not null);
  create table authorities (username varchar(50) not null, authority varchar(50) not null, constraint fk_authorities_users foreign key(username) references users(username));
  ```




# How to run locally
- Clone this branch (spring-boot-security-using-jdbc-mysql-1) to your laptop with the below command:
  (`git clone --branch spring-boot-security-using-jdbc-mysql-1 https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-security-with-mysql-database-0.0.1-SNAPSHOT.jar`)
- You can access the endpoint using the command below :
  (`curl -H "Authorization:dGVzdDpwYXNzd29yZDEyMw==" http://localhost:8085/api/1/config`)


curl http://localhost:8085/api/1/config
