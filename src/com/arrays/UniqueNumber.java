package com.arrays;

public class UniqueNumber {

    public static void main(String[] args) {

        int [] arr = {4, 1, 2, 1, 2};

        System.out.println("Single number in nums1: " + singleNumber(arr));


    }

    public static int singleNumber(int[] num) {

        int unique = 0;
        for (int nums : num) {

            unique = unique ^ nums;
            //unique ^= num;


        }

        return unique;
    }

}
