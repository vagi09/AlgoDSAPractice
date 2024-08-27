package com.arrays;

public class RemoveDuplicates {


    public int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                nums[k] = nums[i];

                k++;


            }


        }


        return k;
    }

    public static void main(String[] args) {

//        int [] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);

        System.out.println("The number of unique elements is: " + k);
        System.out.print("The modified array is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
