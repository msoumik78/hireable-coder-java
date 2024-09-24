package com.example.demo;

import java.util.Base64;

public class CreateCredentials {
  public static void main(String[] args) {
    String user = "user";
    // replace with generated password
    String password = "cd0abe40-644c-4d20-a5b7-76ee3d48803b";
    String encoding = Base64.getEncoder().encodeToString((user + ":" + password).getBytes());
    String authHeader = "Basic " + encoding;
    System.out.println(authHeader);
  }
}
