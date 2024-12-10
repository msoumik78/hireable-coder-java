# Functionality : Standalone Java program demonstrating the efficiency of connection pooling
Simple java standalone application which queries MySQL database with and without connection pooling. 


# Technical details and Pre-requisites
- Written using core java.
- Uses MySQL database in docker container
- Command to start docker container and create a database as follows
  - docker run --name soumik-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql
  - docker exec -it soumik-mysql mysql -uroot -p
- Then create a database named 'testusers' within the mysql container


# How to run locally
- First run the program to create table & populate data
- Then run the program without connection pool 
- Then run the program with connection pool
