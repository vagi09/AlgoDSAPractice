package com.arrays;

import java.util.HashMap;

public class TwoSumUsingCompetativeProg {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        for (int i : result) {

            System.out.println(i);
        }


    }

    public static int[] twoSum(int[] arr, int target) {

        // Hash Map that stores Current number and its indices

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            //find the complement number
            int complement = target - arr[i];

            if (numMap.containsKey(complement)) {

                return new int[]{numMap.get(complement), i};
            }

            numMap.put(arr[i], i);


        }

        return new int[]{};
    }
}