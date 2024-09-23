package com.example.demo;

public class RunnableTask implements Runnable {
  private int taskId;

  public RunnableTask(int taskId) {
    this.taskId = taskId;
  }

  @Override
  public void run() {
    System.out.println("Running task "+taskId+" in thread:" + Thread.currentThread().getName());
  }
}
