package com.example.demo;

import static com.example.demo.CurrencyCalculaeValidator.areAllInputsProvided;
import static com.example.demo.CurrencyCalculatorService.calculateValueInTargetCurrency;

public class CurrencyConverterApp {
  public static void main(String[] args) {
    if (!areAllInputsProvided(args)) {
      System.exit(0);
    }
    float amountInTargetCurrency = calculateValueInTargetCurrency(args);
    System.out.println("Amount in target currency : "+amountInTargetCurrency);
  }
}
