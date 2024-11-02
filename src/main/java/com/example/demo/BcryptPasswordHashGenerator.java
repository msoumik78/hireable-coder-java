package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPasswordHashGenerator {
  public static void main(String[] args) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String passwordTobeHashed = "password123";
    System.out.println(passwordEncoder.encode(passwordTobeHashed));
  }
}
