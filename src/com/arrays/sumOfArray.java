package com.arrays;

public class sumOfArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        System.out.println("sum of array is: " + arraySum(arr));

    }

    public static int arraySum(int[] arr) {

        int n = arr.length + 1;

        int expecctedSum = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        return expecctedSum - sum;

    }
}
