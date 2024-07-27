package com.strings;

public class RecursionPrintNumbers {

    public static void main(String[] args) {

        int start = 1;

        int end = 10;


        prinNumber(start, end);


    }


    public static void prinNumber(int current, int end) {

        if (current > end) {

            return;
        }


        System.out.println(current);


        prinNumber(current + 1, end);
    }


}
