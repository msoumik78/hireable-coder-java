package com.example.demo;

import java.util.List;

public class StreamsDemo {
  public static void main(String[] args) {
    List<String> citiesList = List.of("Kolkata", "Delhi", "Mumbai",
      "Kualalampur","Denver", "Manchestor", "London", "Kolkata", "Delhi");

    List<String> citiesSubLis = citiesList.stream()
      .map(String::toUpperCase)
      .filter(s -> s.startsWith("D"))
      .toList();
    citiesSubLis.forEach(System.out::println);

    String firstCity = citiesList.stream()
      .findFirst().get();

    citiesList.stream().distinct().forEach(System.out::println);

    List<String> sortedList= citiesList.stream().sorted().toList();
    sortedList.forEach(System.out::println);

  }
}
