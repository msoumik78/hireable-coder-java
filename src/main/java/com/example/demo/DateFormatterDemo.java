package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterDemo {
  public static void main(String[] args) {
      printDate(date -> {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        return date.format(formatter);
      });

    printDate(date -> {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return date.format(formatter);
    });
  }

  private static void printDate(IDateFormatter iDateFormatter) {
    System.out.println(iDateFormatter.formatDate(LocalDate.now()));
  }
}
