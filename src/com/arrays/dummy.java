package com.arrays;

import java.util.Arrays;

public class dummy {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        //length of array

        System.out.println("lenght of array: " + arr.length);

        // Iterating array
        System.out.println("Iterating through Array: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

        //Sorting array
        Arrays.sort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));


// array binary search
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Array Binary Search: " + index);

        String str  = "Apple";

        System.out.println(str.replace('e', 'a'));

    }
}
