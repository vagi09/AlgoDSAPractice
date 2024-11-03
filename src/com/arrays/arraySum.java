package com.arrays;

public class arraySum {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int result = sumArray(nums);

        System.out.println("sum of array elements: " + result);

    }

    public static int sumArray(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

//            sum = sum + arr[i];
            sum += arr[i];
        }

        // Initialize an index variable to track the position in the array
//        int index = 0;
//
//        // Loop through the array using a while loop
//        while (index < arr.length) {
//            sum += arr[index]; // Adds each element to the sum
//            index++; // Move to the next element
//        }

        return sum;
    }
}
