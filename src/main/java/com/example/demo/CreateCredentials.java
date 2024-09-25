package com.example.demo;

import java.util.Base64;

public class CreateCredentials {
  public static void main(String[] args) {
    String user = "test";
    // replace with generated password
    String password = "password";
    String encoding = Base64.getEncoder().encodeToString((user + ":" + password).getBytes());
    String authHeader = "Basic " + encoding;
    System.out.println(authHeader);
  }
}
