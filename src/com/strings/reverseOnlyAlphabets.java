package com.strings;

public class reverseOnlyAlphabets {

    public static void main(String[] args) {
        String s = "34test909gda@sdet!23pro";
        String result = reverseAlphabets(s);
        System.out.println("Reversed String: " + result);
    }

    public static String reverseAlphabets(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;


        while (left < right) {

            if (!Character.isLetter(chars[left])) {

                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left ++;
                right --;
            }


        }


        return new String(chars);
    }
}
