package com.arrays;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] arr = {2, 2, 3, 1};  // Example array to start with
        int n = arr.length;  // Find the length of the array

        // Step 2: Start the outer loop to go through each element
       // Start with count 1 for the current element
        for (int i = 0; i < n; i++) {

            int count = 1;

            // Step 3: Check if the element has been counted before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) { // Check from start up to current index
                if (arr[i] == arr[k]) {   // If a match is found
                    alreadyCounted = true; // Mark as already counted
                    break;                 // Exit loop early
                }
            }

            // If already counted, skip to the next element
            if (alreadyCounted) {
                continue;
            }

            // Step 4: Count occurrences of the current element
            for (int j = i + 1; j < n; j++) {  // Check from current position onwards
                if (arr[i] == arr[j]) {
                    count++;  // Increment count for each match
                }
            }

            // Step 5: Print the result for the current element
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}

/*

This code first count the number of elements how many times repeated
and then if the number is already counted ignores it or skips it
public class FrequencyCounterModified {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1}; // Example array
        int n = arr.length; // Length of the array

        // Step 1: Start the outer loop to go through each element
        for (int i = 0; i < n; i++) {
            int count = 1; // Start with count 1 for the current element

            // Step 2: Count occurrences of the current element
            for (int j = i + 1; j < n; j++) { // Check from current position onwards
                if (arr[i] == arr[j]) {
                    count++; // Increment count for each match
                }
            }

            // Step 3: Check if the element has been counted before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) { // Check from start up to current index
                if (arr[i] == arr[k]) { // If a match is found
                    alreadyCounted = true; // Mark as already counted
                    break; // Exit loop early
                }
            }

            // If already counted, skip to the next element
            if (alreadyCounted) {
                continue;
            }

            // Step 4: Print the result for the current element
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}

*/