package com.strings;

public class IntegerSumWhenStringGiven {

    public static void main(String[] args) {
        String str = "prince1234";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            int ch = Character.getNumericValue(c);

            if (Character.isDigit(c)) {


                sum = sum + ch;

            }

        }

        System.out.println("The sum of integers is: " + sum);


    }
}
