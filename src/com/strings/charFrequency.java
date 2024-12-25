package com.strings;

import java.util.HashMap;
import java.util.Map;

public class charFrequency {

    public static void main(String[] args) {

        String s = "aabbaabbccdd";

        Map<Character, Integer> charCount = getCharFreq(s);

        for (Map.Entry<Character, Integer> entry: charCount.entrySet() ){

            System.out.println(entry.getKey() + " <-> " + entry.getValue());
        }

    }

    public static Map<Character, Integer> getCharFreq(String str){

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c: str.toCharArray()){

            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }
        return charCount;
    }
}
