package com.strings;

public class numberToWords {

    public static void main(String[] args) {

        int num = 1434;

        System.out.println(convertToWords(num));


    }


    public static String convertToWords(int num) {

        //build one array with all the numbers
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        //decalre a string builder
        StringBuilder result = new StringBuilder();

        // take out last digit from the number
        while (num > 0) {

            int digit = num % 10;
            //map with array digit
            result.insert(0, words[digit]);
            num /= 10;
        }

        return result.toString();


    }
}
