package com.arrays;

import java.util.Arrays;

public class arrayRotationByBruteForce {
    public static int[] arrayLeftRotation(int[] arr, int positions) {

        int n = arr.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {

            rotated[i] = arr[(i + positions) % n];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 8, 3, 6, 5};

        int positions = 2;

        int[] result = arrayLeftRotation(arr, 2);

        System.out.println(Arrays.toString(result));
    }
}
