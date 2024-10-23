package com.example.demo;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
public class DemoSpringCloudGateway {
	public static void main(String[] args) {
      SpringApplication.run(DemoSpringCloudGateway.class, args);
	}

  @Bean
  public HttpClient httpClient() {
    return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
  }


/*  @Bean
  @Primary
  public WebClient webClient() {
    HttpClient httpClient = HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
    return WebClient.builder()
      .clientConnector(new ReactorClientHttpConnector(httpClient))
      .build();
  }*/

  @Bean
  public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    return builder.routes()
      .route(p -> p.path("/get")
        .filters(f -> f.addRequestHeader("Hello", "World"))
        .uri("http://localhost:8085/api/1/config"))
      .build();
  }
}
