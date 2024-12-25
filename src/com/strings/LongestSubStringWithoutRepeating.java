package com.strings;

import java.util.HashSet;

/*
Given a string s, find the length of the longest substring without repeating characters.
Example:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with a length of 3.
 */
//Using sliding window
public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(lengthOfLongestSubString(str));

    }


    public static String lengthOfLongestSubString(String str) {

        int MaxLenght = 0; //To store max lenght
        int left = 0; //start of the sliding window
        String longestSubstring = ""; // To store the longest substring


        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {

                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

//            MaxLenght = Math.max(MaxLenght, right - left + 1);

            if (right - left + 1 > MaxLenght) {
                MaxLenght = right - left + 1;
                longestSubstring = str.substring(left, right + 1); // Extract the substring
            }

        }


//        return MaxLenght;

        System.out.println("Length of Longest Substring: " + MaxLenght);
        return longestSubstring;
    }

}
