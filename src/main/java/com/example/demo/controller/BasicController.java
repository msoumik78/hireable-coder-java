package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1")
@RequiredArgsConstructor
@Slf4j
public class BasicController {
  @Value("${spring.application.name}")
  private String sampleProperty;

  @RequestMapping("/config")
  String getConfig() {
    log.info("Handling request for endpoint : /api/1/config with callerId = {}", MDC.get("CallerId"));
    log.error("Error occurred in controller");
    return this.sampleProperty;
  }
}
