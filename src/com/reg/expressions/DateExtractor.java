package com.reg.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static void main(String[] args) {
        // Define the text containing dates
        String text = "The meeting is scheduled for 15/04/2024 and the deadline is 01/05/2024.";

        // Define the pattern for dates in the format "dd/mm/yyyy"
        String pattern = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(text);

        // Use the find() method to find all occurrences of the pattern in the text
        while (matcher.find()) {
            System.out.println("Date found: " + matcher.group());
        }
    }
}
