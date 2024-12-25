package com.arrays;

import java.util.Arrays;

public class arrayRotationByReverse {

    public static void main(String[] args) {
        int[] a = {4, 1, 8, 3, 6, 5};
        int position = 2;
        rotateLeftInPlace(a, position);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int [] arr, int start, int end){

        while (start< end){

            int temp = arr[start];
            arr [start] = arr[end];
            arr [end] = temp;
            start ++;
            end --;
        }


    }

    public static void rotateLeftInPlace(int [] arr, int positions){

        int n = arr.length;
        positions %=n;

        reverse(arr, 0, positions-1);
        reverse(arr, positions, n-1);
        reverse(arr, 0, n-1);


    }
}
