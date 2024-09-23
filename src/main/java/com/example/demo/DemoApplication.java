package com.example.demo;


import java.util.concurrent.FutureTask;

public class DemoApplication {
  public static void main(String[] args) throws Exception{
    System.out.println("Running in:"+Thread.currentThread().getName());
    Thread thread1 = new Thread(new RunnableTask());
    Thread thread2 = new Thread(new RunnableTask());
    thread1.start();
    thread2.start();


    CallableTask callableTask = new CallableTask();
    FutureTask<String> ft = new FutureTask<>(callableTask);
    Thread thread3 = new Thread(ft);
    thread3.start();
    System.out.println(ft.get());

  }
}
