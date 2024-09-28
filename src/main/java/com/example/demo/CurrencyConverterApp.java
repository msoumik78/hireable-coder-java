package com.example.demo;

import static
  com.example.demo.CurrencyConverterValidator.areAllInputsProvided;
import static
  com.example.demo.CurrencyConverterService.calculateValueInTargetCurrency;

public class CurrencyConverterApp {
  public static void main(String[] args) {
    if (!areAllInputsProvided(args)) {
      System.exit(0);
    }
    //String testNAme = "Test1";
    float amountInTargetCurrency = calculateValueInTargetCurrency(args);
    System.out.println("Amount in target currency : "+amountInTargetCurrency);
  }
}
