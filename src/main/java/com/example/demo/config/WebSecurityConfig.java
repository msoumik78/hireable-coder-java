
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Bean
  @Order(1)
  public SecurityFilterChain filterChain1(HttpSecurity http) throws Exception {
    return http
      .authorizeHttpRequests(
        auth -> {
          auth.requestMatchers("/api/1/private").authenticated();
          auth.anyRequest().permitAll();
        }
      )
      .httpBasic(Customizer.withDefaults())
      .build();
  }


  @Bean
  @Order(2)
  public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception {
    return http
      .authorizeHttpRequests(
        auth -> auth.requestMatchers("/api/2/private").permitAll()
      )
      .httpBasic(Customizer.withDefaults())
      .build();
  }

}

