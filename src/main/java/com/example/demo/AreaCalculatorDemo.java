package com.example.demo;

import java.util.function.Function;

public class AreaCalculatorDemo {
  public static void main(String[] args) {

    Function<Integer, Float> squareFunction = d -> (float) (d*d);
    Function<Integer, Float> circleFunction = d -> (float) (3.14*d*d);
    Function<Integer, Float> triangleFunction = d -> (float) (0.5*d*d);

    System.out.println("Square area : "+calculate(squareFunction, 5));
    System.out.println("Circle area : "+calculate(circleFunction, 5));
    System.out.println("Triangle area : "+calculate(triangleFunction, 5));

  }

  private static Float calculate(Function<Integer,Float> function, Integer side) {
    return function.apply(side);
  }

}

