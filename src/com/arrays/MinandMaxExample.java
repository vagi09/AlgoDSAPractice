package com.arrays;

public class MinandMaxExample {

    public static void main(String[] args) {

        int[] a = {9, 5, 6, 2, 3, 4, 2, 1};

        // Call the findMinMax method
        int[] minMax = findMinMax(a);

        // Print min and max
        System.out.println("Minimum element: " + minMax[0]);
        System.out.println("Maximum element: " + minMax[1]);

    }

    public static int[] findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }
}
