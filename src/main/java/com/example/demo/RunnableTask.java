package com.example.demo;

public class RunnableTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Running in thread:" + Thread.currentThread().getName());
  }
}
