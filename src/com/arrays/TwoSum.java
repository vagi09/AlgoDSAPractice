package com.arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int target = 5;
        //[3, 5]

        int[] result = twoSum(arr, target);

        System.out.println("Indices: [" + result[0] + "," + result[1] + "]");


    }


    public static int[] twoSum(int[] nums, int target) {

        //Outer loop to iterate through array
        for (int i = 0; i < nums.length; i++) {

            // Inner loop checks every other element after the current element
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the two elements is equal to the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices as soon as the target sum is found
                    return new int[]{i, j};

                }


            }


        }
// Return an empty array if no solution is found (shouldn't happen given the problem constraints)
        return new int[]{};
    }

}
