package com.arrays;

public class Example {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3};
//
//        int n = arr.length;
//
//        System.out.println(findSum(arr,n ));

        int n = 3;

        System.out.println(sumNumbers(n));


    }

    public static int findSum(int[] arr, int n) {

        if (n <= 0) {


            return 0;
        }

        return arr[n - 1] + findSum(arr, n - 1);


    }

    public static int sumNumbers(int num) {

        if (num == 0 || num == -1) {

            return 0;
        }

        return num + sumNumbers(num - 1);
    }
}
