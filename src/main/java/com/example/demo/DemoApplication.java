package com.example.demo;


import io.nats.client.Connection;
import io.nats.client.Nats;

import java.nio.charset.StandardCharsets;

public class DemoApplication {
  public static void main(String[] args) throws Exception{
    Connection nc = Nats.connect();
    nc.publish("test-subject", "hello world from java".getBytes(StandardCharsets.UTF_8));
    System.out.println("published");
  }
}
