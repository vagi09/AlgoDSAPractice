package com.arrays;

import java.util.Arrays;

public class RemoveDuplicatesUsingIndex {

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        Arrays.sort(arr);


        int uniqueIndex = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {

                arr[uniqueIndex] = arr[i];
                    uniqueIndex++;
            }


        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,6,4,2,3};

        int newLenght = removeDuplicates(arr);

        for (int i = 0; i < newLenght; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
