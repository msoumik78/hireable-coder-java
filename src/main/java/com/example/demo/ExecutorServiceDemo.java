package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
  public static void main(String[] args)  {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    for (int i=0; i < 6; i++) {
      RunnableTask task = new RunnableTask(i+1);
      executorService.submit(task);
    }

    executorService.shutdown();
  }
}
