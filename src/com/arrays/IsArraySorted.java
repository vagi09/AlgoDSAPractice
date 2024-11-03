package com.arrays;

public class IsArraySorted {
    public static void main(String[] args) {

        int[] num = {0, 1, 2, 3, 4};
        int[] nums = {4, 3, 2, 1, 0};

        boolean IsSorted = IsGivenArraySorted(num);

        System.out.println("Is Array Sorted1: " + IsSorted);

        boolean IsSorted2 = IsGivenArraySorted(nums);

        System.out.println("Is Array Sorted2: " + IsSorted2);

        boolean IsSorted3 = isSortedAscending(num);

        System.out.println("Is Array Sorted3: " + IsSorted3);

    }

    public static boolean IsGivenArraySorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {

                return false;
            }
        }

        return true;
    }

    public static boolean isSortedAscending(int[] arr) {
        if (arr.length <= 1) {
            return true; // Single element or empty array is considered sorted
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false; // Found a pair of elements out of order
            }
        }
        return true; // All elements are in ascending order
    }


}
