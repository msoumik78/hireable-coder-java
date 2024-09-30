package com.example.demo;


import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class HashingUsingArgonDirectly {
  public static void main(String[] args) {
    String originalPassword = "abc123";
    String providedPassword = "abc123";

    Argon2 argon2 = Argon2Factory.create();
    char[] password = originalPassword.toCharArray();
    try {
      // Store the generated hash below in the database
      String hash = argon2.hash(2, 1000, 1, password);
      if (argon2.verify(hash, providedPassword)) {
        System.out.println("Hash Matches");
      } else {
        System.out.println("Hash does not match");
      }
    } finally {
      argon2.wipeArray(password);
    }
  }
}
