package com.example.demo;

import java.util.Map;

public class CurrencyConverterService {

  private static Map<String, Float> currencyExchangeRates
    = Map.of
    ("USD-INR", 80f,
    "EUR-INR", 90f,
    "GBP-INR", 95f,
     "INR-USD", 0.0125f
    );

  public static float calculateValueInTargetCurrency(String[] args){
    String sourceCurrency = args[0];
    String targetCurrency = args[1];
    float amount = Float.parseFloat(args[2]);
    float conversionRate = currencyExchangeRates.get(sourceCurrency+"-"+targetCurrency);
    return amount*conversionRate;
  }
}
