package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoApplication {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    for (int i=0; i < 6; i++) {
      executorService.submit(new RunnableTask());
    }
    executorService.isShutdown();

  }
}
