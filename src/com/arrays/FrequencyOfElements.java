package com.arrays;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {

        // Step 1: Initialize the array
        int[] arr = {1, 2, 2, 3, 4, 4, 4};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {

            if (freqMap.containsKey(num)) {

                freqMap.put(num, freqMap.get(num) + 1);
            } else {

                freqMap.put(num, 1);
            }


        }


        System.out.println("Element Frequencies:");

        for (int key : freqMap.keySet()) {

            System.out.println("Element " + key + " Occurs " + freqMap.get(key) + " times.");


        }

    }
}
