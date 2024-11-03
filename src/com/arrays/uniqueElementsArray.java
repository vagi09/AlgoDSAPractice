package com.arrays;

import java.util.Arrays;

public class uniqueElementsArray {


    public static void main(String[] args) {

        int a[] = { 1, 1, 2, 2, 2, 4, 2 };

        int n = a.length;

      n = removeDuplictes(a,n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }


    public static int removeDuplictes(int[] arr, int n) {

        if (n == 0 || n == 1) {

            return n;
        }

        //sort the given array

        Arrays.sort(arr);

// ceate new array to store unique elements
        int[] temp = new int[n];
// j keeps the count of unique elements
        int j = 0;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] != arr[i + 1]) {

                temp[j++] = arr[i];
            }
        }

        // adding last elements
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {

           arr[i]  = temp[i];
        }

        return j;
    }


}
