package com.example.demo;


import java.util.concurrent.FutureTask;

public class DemoApplication {
  public static void main(String[] args){
  Thread thread1 = new Thread(() -> System.out.println("Running in non main thread"));
  Thread thread2 = new Thread(() -> {
    System.out.println("This runnable has multiple lines");
    System.out.println("Running in non main thread" );
  });
    thread1.start();
    thread2.start();

    FutureTask<String> ft = new FutureTask<>(() -> {
      return "Hello World";
    });
    Thread thread3 = new Thread(ft);
    thread3.start();
  }
}
