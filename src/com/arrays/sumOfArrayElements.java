package com.arrays;

public class sumOfArrayElements {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int result = sumOfArray(arr);

        System.out.println(result);


    }


    public static int sumOfArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        return sum;
    }
}
