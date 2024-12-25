package com.strings;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        String str = "hello";

        System.out.println(reverseString(str));

//        char c = str.charAt(0);
//
//       String str1 = str.substring(1);
//
////        System.out.println(str1);
////        System.out.println(c);
//
//        System.out.println(str1 + c);

//        System.out.println(str.substring(0, str.length()-1));

    }

    public static String reverseString(String str){

        if (str.isEmpty()){

            return str;
        }

//       return reverseString(str.substring(1))+ str.charAt(0);
        System.out.print(str.charAt(str.length() - 1));

        return reverseString(str.substring(0, str.length()-1));
        //hello

       //ello + h
        // llo + e
        // lo + l
        // o +l
        //o + " "

        //o
        //ol
        // oll
        //olle
        //olleh


    }



}
