package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample {
  public static void main(String[] args) throws Exception{

  }

  public static int invokeGETEndpoint() throws IOException, InterruptedException {
    HttpResponse<String> response;
    HttpClient httpClient = null;
    try
    {
      httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .connectTimeout(Duration.ofSeconds(10))
        .build();
      HttpRequest request = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create("http://localhost:3000/users"))
        .build();
      response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    } finally {
        assert httpClient != null;
    }
    return response.statusCode();
  }

}
