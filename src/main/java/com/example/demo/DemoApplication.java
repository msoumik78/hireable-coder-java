package com.example.demo;

import lombok.extern.java.Log;

@Log
public class DemoApplication {
  public static void main(String[] args) throws Exception{
    Employee employee1 = new Employee(1, "emp1", 45);
    System.out.println(employee1.getAge());
    System.out.println(employee1);
    Employee employee2 = new Employee();
    employee2.setId(2);
    employee2.setAge(34);
    employee2.setName("emp2");
    Employee employee3 = Employee.builder().id(4).name("emp4").age(50).build();
    System.out.println(employee3);
    log.info("custom log statement");
  }
}
