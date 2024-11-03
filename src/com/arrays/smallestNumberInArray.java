package com.arrays;

public class smallestNumberInArray {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 6, 7, 1};

        System.out.println(smallestArrayNumber(arr));

    }


    public static int smallestArrayNumber(int[] arr) {

        // assume that first element of an array is the smallest
        // compare every other element with first element
        // note down if it is smallesr

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {



                smallest = arr[i];


            }
        }

        return smallest;


    }

}
