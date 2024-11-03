package com.arrays;

import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 1, 3, 4, 4, 5, 6};

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        for (int num : arr) {
            set.add(num); // HashSet will automatically ignore duplicates
        }

        // Print the unique elements
        System.out.print("Array without duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
