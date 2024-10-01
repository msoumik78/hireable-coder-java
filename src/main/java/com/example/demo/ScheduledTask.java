package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

  private final DemoService demoService;

  @Value("${message}")
  private String sampleProperty;

    public ScheduledTask(DemoService demoService) {
        this.demoService = demoService;
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("Scheduled job running : "+sampleProperty);
        demoService.executeSampleMethod();
        //log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
