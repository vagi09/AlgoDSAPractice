package com.strings;

import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i=0; i<str.length(); i++){

                char c = str.charAt(i);

                charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }
        charCount.forEach((key, value) -> System.out.println(key + ": " + value));

//        System.out.println(charCount);
    }
}
