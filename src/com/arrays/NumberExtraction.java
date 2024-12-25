package com.arrays;

public class NumberExtraction {

    public static String extractNumbers(String input) {
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numbers.append(ch);
            }
        }

        return numbers.toString();
    }

    public static void main(String[] args) {
        String input = "abc38gh89";
        String extractedNumbers = extractNumbers(input);
        System.out.println("Extracted numbers: " + extractedNumbers);
    }

}