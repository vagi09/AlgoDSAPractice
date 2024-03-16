package com.arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        // Print reversed array
        System.out.println("Reversed array:");
        printArray(array);
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move start index towards the end and end index towards the start
            start++;
            end--;
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

