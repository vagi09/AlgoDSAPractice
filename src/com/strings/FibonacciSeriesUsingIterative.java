package com.strings;

public class FibonacciSeriesUsingIterative {


    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int n = 10;

//        System.out.print("Fibonacci Series (Iterative): ");


        for (int i = 0; i < n; i++) {

            System.out.print(num1 + " ");

            int nextNum = num1 + num2;

            num1 = num2;
            num2 = nextNum;


        }

    }


}
