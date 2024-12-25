package com.strings;

public class ReverseStringRecursion {

    public static void main(String[] args) {
        String input = "HelloWorld";
        String reversed = ReverserString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String ReverserString(String str){

        if(str == null || str.length()<=1){

            return str;
        }

        return ReverserString(str.substring(1)) + str.charAt(0);



    }
}
