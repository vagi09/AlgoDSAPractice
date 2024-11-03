package com.strings;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello";


        System.out.println("Forward loop: " + reverseString(str));

        System.out.println("Backward loop: " + reverseUsingBackwardlop(str));
    }


    public static String reverseString(String Str) {

        String rev = "";


        for (int i = 0; i < Str.length(); i++) {

            char ch = Str.charAt(i);

            rev = ch + rev;


        }

        return rev;
    }

    public static String reverseUsingBackwardlop(String str){

        String rev = "";

        for(int i = str.length()-1; i>=0; i--){

            char ch = str.charAt(i);

            rev = rev + ch;
        }

        return rev;
    }
}
