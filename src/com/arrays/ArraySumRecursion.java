package com.arrays;

public class ArraySumRecursion {

    public static void main(String[] args) {

    }


    public static int findSum (int [] arr, int n){

        if(n<=0){

            return 0;
        }

        return arr[n-1] + findSum(arr, n-1);
    }
}
