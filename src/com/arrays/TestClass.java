package com.arrays;

public class TestClass {

    public static void main(String[] args) {

        String str = "I Love Coding";

        String[] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length-1; i>=0; i--){

            reversed.append(words[i]);

            if(i !=0){

                reversed.append(" ");
            }


        }

        System.out.println(reversed.toString());



    }
}
