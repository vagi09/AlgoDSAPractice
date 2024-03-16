package com.arrays;

import java.util.Arrays;

public class MaxAndMinElement {

    public static void main(String[] args) {

        int[] a = {9, 5, 6, 2, 3, 4, 2, 1};


        Arrays.sort(a);

        // Print the sorted array in array format
        System.out.print("Sorted array: {");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.println("}");

        System.out.println("min: " + a[0] + "\nmax: " + a[a.length - 1]);


    }


}
