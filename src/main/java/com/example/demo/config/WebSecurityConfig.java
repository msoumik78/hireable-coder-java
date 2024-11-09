
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http
      .authorizeHttpRequests(
        auth -> {
          auth.requestMatchers("/api/1/private").authenticated();
          auth.anyRequest().permitAll();
        }
      )
      .httpBasic(Customizer.withDefaults())
      .formLogin(Customizer.withDefaults())
      .oauth2Login(Customizer.withDefaults())
      .build();
  }

}

