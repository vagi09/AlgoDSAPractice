package com.reg.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Define the string
        String text = "hello";

        // Define the pattern
        String pattern = "ell";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(text);

        // Use the find() method to find if the pattern exists in the text
        if (matcher.find()) {
            System.out.println("Pattern found!");
        } else {
            System.out.println("Pattern not found!");
        }
    }
}
