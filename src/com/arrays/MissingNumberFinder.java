package com.arrays;

public class MissingNumberFinder {

    /*
    Logic
    - find the length of input array add 1
    - find the sum of first natural numbers ( expected sum)
    - initialize the total sum of array to ZERO ( Actual sum)
    - iterate through the i/p array and find the total sum.
    - difference b/n expected sum - actual sum is the missing number.

     */

    /*
        Consider an array of size 4: [1, 2, 4, 5]
        The actual length of the array is 4.
        But, the complete set should have 5 numbers (1 to 5).
        So, we add 1 to the length: n = 4 + 1 = 5
        Now, we calculate the expected sum: expected_sum = 5 * (5 + 1) / 2 = 15
        The actual sum of the array is 12.
        The missing number is the difference: 15 - 12 = 3
        By adding 1 to the length, we accurately calculate the expected sum and, consequently, identify the missing number.
     */


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        //op missing num = 3

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
