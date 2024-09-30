package com.example.demo;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

public class HashingUsingSpringSecurityCrypto {
  public static void main(String[] args) {
    String originalPassword = "abc123";
    String providedPassword = "abc123";

    int saltLength = 128 / 8; // 128 bits
    int hashLength = 256 / 8; // 256 bits
    int parallelism = 1;
    int memoryInKb = 1024; // 1 MB
    int iterations = 4;
    Argon2PasswordEncoder passwordEncoder = new Argon2PasswordEncoder(saltLength, hashLength, parallelism, memoryInKb, iterations);
    String hashed = passwordEncoder.encode(originalPassword);
    boolean matches = passwordEncoder.matches(providedPassword, hashed);
    if (matches) {
      System.out.println("Hash matches");
    } else {
      System.out.println("Hash does not match");
    }
  }
}
