package com.strings;

public class numberToWords {

    public static void main(String[] args) {

        int num = 1434;

        System.out.println(convertToWords(num));


    }


    public static String convertToWords(int num) {

        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        StringBuilder result = new StringBuilder();

        while (num > 0) {

            int digit = num % 10;

            result.insert(0, words[digit]);
            num /= 10;
        }

        return result.toString();


    }
}
