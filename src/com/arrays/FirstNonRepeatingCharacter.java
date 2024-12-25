package com.arrays;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "leetcode";

        System.out.println(nonRepeatingChar(str));

    }

    public static int nonRepeatingChar(String str) {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);


        }

        for (int i = 0; i < str.length(); i++) {

            if (frequencyMap.get((str.charAt(i))) == 1) {

                System.out.println("First non-repeating character: " + str.charAt(i));


                return i;
            }
        }


        return -1;
    }
}
