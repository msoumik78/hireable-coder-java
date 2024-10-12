package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1")
@RequiredArgsConstructor
public class BasicController {
  @Value("${spring.application.name}")
  private String sampleProperty;

  @RequestMapping("/config")
  String getConfig() {
    return this.sampleProperty;
  }
}
