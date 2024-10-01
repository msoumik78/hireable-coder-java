package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSpringBootWithoutWebServer implements CommandLineRunner {
	public static void main(String[] args) {
      SpringApplication.run(DemoSpringBootWithoutWebServer.class, args);
	}

  @Override
  public void run(String... args) {
    System.out.println("In run method after server start");
  }

}
