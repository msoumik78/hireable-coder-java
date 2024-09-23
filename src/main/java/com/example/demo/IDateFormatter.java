package com.example.demo;

import java.time.LocalDate;

@FunctionalInterface
public interface IDateFormatter {
  String formatDate(LocalDate date);
}
