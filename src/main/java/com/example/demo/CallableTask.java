package com.example.demo;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
  @Override
  public String call() throws Exception {
    return "Hello World";
  }
}
