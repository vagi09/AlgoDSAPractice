package com.arrays;

public class test {

    public static void main(String[] args) {

       


        int[] arr = {1, 1, 3, 1, 5};

// Iterating through each element of an array.
        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            // loop to keep the count of repetative elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            //loop to skip if number is already counted
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Step 4: Print the result for the current element
            System.out.println(arr[i] + " occurs " + count + " times");

        }
    }
}
