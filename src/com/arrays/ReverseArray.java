package com.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        reversingArray(numbers);
//
//        System.out.println(reversingArray(numbers));

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(numbers));


    }

    public static void reversingArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // using temp varaible
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;

            // using add and sub

//            arr[start] = arr[start] + arr[end];
//            arr[end] = arr[start] - arr[end];
//            arr[start] = arr[start] - arr[end];

            // using XOR
//            arr[start] = arr[start] ^ arr[end];
//            arr[end] = arr[start] ^ arr[end];
//            arr[start] = arr[start] ^ arr[end];

            // using mul and div
            arr[start] = arr[start] * arr[end];
            arr[end] = arr[start] / arr[end];
            arr[start] = arr[start] / arr[end];





            start++;
            end--;
        }
    }
}
