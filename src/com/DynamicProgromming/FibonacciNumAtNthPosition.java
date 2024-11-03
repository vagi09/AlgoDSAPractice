package com.DynamicProgromming;

public class FibonacciNumAtNthPosition {


    //Fibonacci series using Tabulation method in DP

    //F(0) = 0
    //F(1) = 1
    //F(n) = F(n-1) + F(n-2) for n>1

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

    }


    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

/// Create a table to store Fibonacci values
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];
        }


        return fib[n];

    }

}
