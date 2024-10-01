package com.example.demo;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class DemoOfParallelStreams {
    public static void main(String[] args) {
        int targetNumber = 10000000;
        IntFunction forLoopFunc = n -> {
            int sum = 0;
            for (int i =0; i < n; i++) {
                sum = sum + i;
            }
            return sum;
        } ;

        IntFunction seqStreamFunc = n -> {
            int sum;
            sum = IntStream.rangeClosed(0,n-1).sum();
            return sum;
        } ;

        IntFunction parallelStreamFunc = n -> {
            int sum;
            sum = IntStream.rangeClosed(0,n-1).parallel().sum();
            return sum;
        } ;

        calculateExecutionTime(forLoopFunc, targetNumber);
        calculateExecutionTime(seqStreamFunc, targetNumber);
        calculateExecutionTime(parallelStreamFunc, targetNumber);
    }

    private static void calculateExecutionTime(IntFunction func, int n) {
        int iterationCount = 10;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= iterationCount; i++) {
            func.apply(n);
        }
        System.out.println("Time taken : "+(System.currentTimeMillis() - startTime));
    }
}
