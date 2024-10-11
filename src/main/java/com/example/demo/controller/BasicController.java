package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1")
@RequiredArgsConstructor
@Slf4j
public class BasicController {
  @Value("${message}")
  private String sampleProperty;

  @RequestMapping("/config")
  String getConfig() {
    log.info("Handling request for endpoint : /api/1/config , custom message = {}", sampleProperty);
    log.error("Error occurred in controller, custom message = {}", sampleProperty);
    return this.sampleProperty;
  }
}
