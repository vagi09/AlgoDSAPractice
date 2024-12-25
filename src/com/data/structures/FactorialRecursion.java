package com.data.structures;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = 5;

        System.out.println(recursiveFactorial(number));
    }

    public static int recursiveFactorial(int n) {

        if (n == 1 || n==0) {

            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }
}
