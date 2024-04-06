package com.reg.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMatcher {
    public static void main(String[] args) {
        // Define the string containing email addresses
        String text = "My email is example@email.com and another email is test@example.com";

        // Define the pattern for an email address
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Use the find() method to find all occurrences of the pattern in the text
        while (matcher.find()) {
            System.out.println("Email found: " + matcher.group());
        }
    }
}
