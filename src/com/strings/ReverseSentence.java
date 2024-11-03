package com.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {

    public static void main(String[] args) {

        String str = "I Love Coding";

        System.out.println(reversingSentence(str));

        System.out.println(reverseUsingForLoop(str));
    }

    public static String reversingSentence(String str) {

        //split string to words
        String[] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            reversed.append(words[i]);
            if (i != 0) {

                reversed.append(" ");
            }


        }

        return reversed.toString();

    }

    public static String reverseUsingList(String str) {

        List<String> words = Arrays.asList(str.split(" "));

        Collections.reverse(words);


        return String.join(" ", words);
    }

    public static String reverseUsingForLoop(String Str) {

        String[] words = Str.split(" ");

        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {

            rev = rev + words[i];

            if (i != 0) {
                rev += " ";
            }
        }

        return rev;
    }
}
