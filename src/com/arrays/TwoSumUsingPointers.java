package com.arrays;

public class TwoSumUsingPointers {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 10;
        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] findTwoSum(int[] arr, int target) {

        // first and last index
        int left = 0;
        int right = arr.length - 1;


        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {

                return new int[]{left, right};
            } else if (sum < target) {
                left++;


            } else {

                right--;
            }
        }

        return null;
    }
}
