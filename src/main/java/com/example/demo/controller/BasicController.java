package com.example.demo.controller;

import com.example.demo.config.UserListConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1")
@RequiredArgsConstructor
public class BasicController {
  @Value("${message}")
  private String sampleProperty;

  private final UserListConfig userListConfig;

  @RequestMapping("/config")
  String getConfig() {
    System.out.println(userListConfig.getUsers().size());
    return this.sampleProperty;
  }
}
