package com.strings;

public class Palindrome {

    public static void main(String[] args) {
        String Str = "racecar";
        String str1 = "hello";

        System.out.println(palindromeChecker(Str));
        System.out.println(palindromeChecker(str1));
    }

    public static boolean palindromeChecker(String Str) {

        int left = 0; //first index
        int right = Str.length() - 1; // last index

        while (left < right) { //as long as left<right
            if (Str.charAt(left) != Str.charAt(right)) {
                //if char at left != right

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
