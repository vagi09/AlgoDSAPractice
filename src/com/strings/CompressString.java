package com.strings;

public class CompressString {
    public static void main(String[] args) {
        String input = "aaAAbbCCddd";
//        String input = "aAaAbCbCded";

        String output = compressString(input);
        System.out.println("String=" + output);
    }

    public static String compressString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }

        // Append the last set of characters
        result.append(s.charAt(s.length() - 1));
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
    }
}
