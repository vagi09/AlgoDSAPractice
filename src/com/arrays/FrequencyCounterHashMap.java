package com.arrays;

import java.util.HashMap;

public class FrequencyCounterHashMap {

    public static void main(String[] args) {

        // Step 1: Initialize the array
        int[] arr = {1, 2, 2, 3, 4, 4, 4};

        // Step 2: Create a HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 3: Iterate through the array
        for (int num : arr) {
            // Step 4: If the element is already in the map, increase its count
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Step 5: If the element is not in the map, add it with a count of 1
                frequencyMap.put(num, 1);
            }
        }

        // Step 6: Print the frequency of each element
        System.out.println("Element Frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("Element " + key + " occurs " + frequencyMap.get(key) + " times.");
        }
    }
}
