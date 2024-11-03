package com.strings;

import java.util.HashSet;

public class CountVowels {

    public static void main(String[] args) {
        String str = "aeiou";
        String str1 = "lymph";
        String str2 = "QUEUEING";


        System.out.println(vowelsCounter(str));
        System.out.println(vowelsCounter(str1));
        System.out.println(vowelsCounter(str2));

    }

    public static int vowelsCounter(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }

    //using array
    public static int countVowels(String str) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < vowels.length; j++) {

                if (ch == vowels[j]) {

                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public class VowelCounterUsingHashSet {
        public static int countVowels(String str) {
            HashSet<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');

            int count = 0;
            for (int i = 0;
                 i < str.length(); i++) {
                if (vowels.contains(str.charAt(i))) {
                    count++;
                }
            }

            return count;
        }
    }
}