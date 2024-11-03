package com.arrays;

public class findMajorityElement {

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element in nums1: " + majorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + majorityElement(nums2)); // Output: 2
    }

    public static int majorityElement(int[] num) {

        int n = num.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (num[j] == num[i]) {

                    count++;
                }


            }

            if (count > n / 2) {

                return num[i];


            }
        }

        return -1;


    }
}
