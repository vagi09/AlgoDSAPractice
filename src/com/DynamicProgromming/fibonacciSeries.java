package com.DynamicProgromming;

import java.util.Arrays;

public class fibonacciSeries {

    public static void main(String[] args) {
        int n = 10; // Change this value to get the series up to any 'n'
        int[] fibSeries = fibonacci(n);

        System.out.println("Fibonacci series up to position " + n + ": " + Arrays.toString(fibSeries));
    }

    public static int[] fibonacci(int n) {

        if (n <= 0) {

            return new int[]{0};
        }

        if (n == 1) {

            return new int[]{0, 1};
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
