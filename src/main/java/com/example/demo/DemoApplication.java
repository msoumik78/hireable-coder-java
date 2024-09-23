package com.example.demo;


import java.util.concurrent.FutureTask;

public class DemoApplication {
  public static void main(String[] args) throws Exception{
    RunnableTask task1 = new RunnableTask(0);
    RunnableTask task2 = new RunnableTask(1);
    RunnableTask task3 = new RunnableTask(2);
    RunnableTask task4 = new RunnableTask(3);
    RunnableTask task5 = new RunnableTask(4);
    RunnableTask task6 = new RunnableTask(5);

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);
    Thread thread3 = new Thread(task3);
    Thread thread4 = new Thread(task4);
    Thread thread5 = new Thread(task5);
    Thread thread6 = new Thread(task6);
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();
    thread6.start();


/*    CallableTask callableTask = new CallableTask();
    FutureTask<String> ft = new FutureTask<>(callableTask);
    Thread thread7 = new Thread(ft);
    thread7.start();
    System.out.println(ft.get());*/

  }
}
