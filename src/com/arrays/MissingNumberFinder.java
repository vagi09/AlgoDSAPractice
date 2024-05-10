package com.arrays;

public class MissingNumberFinder {

    /*

    Logic
    - find the lenght of input array add 1
    - find the sum of first natural numbers ( expected sum)
    - initialize the total sum of array to ZERO ( Actual sum)
    - iterate through the i/p array and find the total sum.
    - difference b/n expected sum - actual sum is the missing number.

     */


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};

        System.out.println("Missing number is: " + findMissingNumberSum(arr));


    }

    public static int findMissingNumberSum(int[] arr) {
        // Calculate 'n' based on array length
        int n = arr.length + 1;

        // Expected sum of first 'n' natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Actual sum of the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The missing number
    }


}
