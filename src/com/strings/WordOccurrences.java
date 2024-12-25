package com.strings;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrences {

    public static void main(String[] args) {
        String s = "This is a test, test sentence to find, find a repetitive words. repetitive words!";

        Map<String, Integer> wordCount = getWordOccurrence(s);

        wordCount.forEach((key, value)-> System.out.println(key + "-" + value));

//        // Print the result
//        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }


    }

    public  static Map<String, Integer> getWordOccurrence(String str){

        String cleanedString = str.replaceAll("[^a-zA-Z0-9 ]","").toLowerCase();

        String [] words = cleanedString.split("\\s+");

        Map<String, Integer> wordMapCount = new HashMap<>();

        for (String word: words){

            wordMapCount.put(word, wordMapCount.getOrDefault(word,0)+1);
        }

        return wordMapCount;
    }
}
