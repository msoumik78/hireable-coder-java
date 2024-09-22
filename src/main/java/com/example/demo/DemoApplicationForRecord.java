package com.example.demo;

public class DemoApplicationForRecord {
  public static void main(String[] args) {
    EmployeeRecord employeeRecord1 = new EmployeeRecord(1, "emp1", 50);
    System.out.println(employeeRecord1.name());
    System.out.println(employeeRecord1);
  }
}
