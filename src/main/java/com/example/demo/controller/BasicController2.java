package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/2")
@RequiredArgsConstructor
public class BasicController2 {

  @Value("${message}")
  private String sampleProperty;

  @RequestMapping("/private")
  String getPrivate() {
    return this.sampleProperty;
  }

}
