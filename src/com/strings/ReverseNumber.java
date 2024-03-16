package com.strings;

public class ReverseNumber {

    public static void main(String[] args) {

        int number = 1234;
        int reversedNumber = revNum(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);

    }

    public static int revNum(int num) {
        // initialize rev to 0
        int rev = 0;
        //loop till num =0
        while (num != 0) {
            //extract a last digit
            int lastDigit = num % 10;
            // multiply with rev with 10 and append the last digit to rev
            rev = rev * 10 + lastDigit;
            // get the last digit again for next iteration
            // num = num/10;
            num /= 10;

        }
        return rev;
    }
}
