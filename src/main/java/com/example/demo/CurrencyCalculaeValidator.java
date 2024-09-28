package com.example.demo;

public class CurrencyCalculaeValidator {
  public static boolean areAllInputsProvided(String[] args) {
    if (args.length != 3) {
      System.out.println("Inputs not provided properly, run the program as : " +
        "java CurrencyConverter <source-currency> <target-currency> <amount>");
      return false;
    }
    if (!checkIfInputIsInteger(args[2])) {
      System.out.println("3rd argument should be an Integer only which " +
        "represents source amount");
    }
    return true;
  }

  private static boolean checkIfInputIsInteger(String obj) {
    try {
      Integer.parseInt(obj);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }
}
