package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDup {

    public static void main(String[] args) {

        //Declare an array
        int[] array = {1, 2, 3, 4, 4, 3, 2, 1};

        //Convert array into Hashset

        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {

            set.add(num);


        }

        System.out.println("HashSet after removing duplicates: " + set);

        // Now convert HashSet into array again

        // Convert HashSet back to an array
        // decalre new array same size as hashset
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        //print the unique arraay

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));


    }


}
