package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findArrayDuplicates {

    public static void main(String[] args) {

        int[] arr = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};

        // Call the method to find duplicates
        Set<Integer> duplicates = findDuplicates(arr);

        // Print the result
        System.out.println(duplicates);


    }


    public static Set<Integer> findDuplicates(int[] arr) {

        //Hash Map to store th count of each chars
        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> result = new HashSet<>();

        //count the occurance of each element
        for (int num : arr) {

            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {

            if (entry.getValue() > 1) {

                result.add(entry.getKey());
            }


        }

        return result;
    }
}
