package com.arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        // Declaring an array
        int[] num = {1, 2, 3, 4, 5, 6};

        // accesing array elements
        int start = num[0];
        int last = num[num.length - 1];
        System.out.println("First element of an array: " + start);
        System.out.println("First element of an array: " + last);

        // traversing through an array
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
        }

        //using for each loop
        for (int i : num) {

            System.out.println(i);
        }

        // finding how no.of elements in an array

        System.out.println("lenght of an array: " + num.length);
    }







}
