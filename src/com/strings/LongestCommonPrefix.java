package com.strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};



//        System.out.println(str[0].indexOf('k'));


        System.out.println("Longest Common Prefix: " + longCommonPrefix(str)); // Output: "fl"

    }

    public static String longCommonPrefix(String[] str) {

//        String Prefix = str[0];
//
//        System.out.println("First String: " + Prefix);
//        System.out.println("Length of First string: " + Prefix.length());
//        String ShortenedPrefix = Prefix.substring(0, Prefix.length() - 1);
//
//        System.out.println("Shortened Prefix: " + ShortenedPrefix);

        for (int i = 1; i < str.length; i++) {

            while (str[i].indexOf(str[0]) != 0) {

                str[0] = str[0].substring(0, str[0].length() - 1);

                if (str[0].isEmpty()) {

                    return "";
                }
            }
        }


        return str[0];
    }


}
