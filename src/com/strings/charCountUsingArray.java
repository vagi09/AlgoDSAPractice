package com.strings;

public class charCountUsingArray {

    public static void main(String[] args) {

        String str = "geeksforgeeks";

        int[] counts = new int[256];

        // Count occurrences of each character

        for (int i = 0; i < str.length(); i++) {

            counts[str.charAt(i)]++;

        }

        // Print the counts of characters that appeared
        for (int i = 0; i < 256; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }

    }

}


}
