package com.strings;

public class RecursionFibonacci {
    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to print Fibonacci sequence up to n terms
    public static void printFibonacciSequence(int terms) {
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + ",");
        }
    }

    // Main method to test the printFibonacciSequence method
    public static void main(String[] args) {
        int numberOfTerms = 10; // Change this to print more or fewer terms
        System.out.println("Fibonacci sequence up to " + numberOfTerms + " terms:");
        printFibonacciSequence(numberOfTerms);
    }
}
