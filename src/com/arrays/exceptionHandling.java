package com.arrays;

public class exceptionHandling {

    public static void main(String[] args) {
        try {

            int numerator = 10;
            int denominator = 0;
            int divison = numerator / denominator;

            System.out.println("The result is: " + divison);

        } catch (ArithmeticException e) {

            // Code to handle the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Code that runs regardless of whether an exception occurred or not
            System.out.println("Division operation completed.");

        }
    }
}
