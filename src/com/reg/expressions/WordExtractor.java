package com.reg.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordExtractor {
    public static void main(String[] args) {
        // Define the text containing words
        String text = "The cat and the dog chased each other in the courtyard.";

        // Define the pattern for words starting with 'c'
        String pattern = "\\b[cC]\\w+\\b";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(text);

        // Use the find() method to find all occurrences of the pattern in the text
        while (matcher.find()) {
            System.out.println("Word starting with 'c': " + matcher.group());
        }
    }
}
