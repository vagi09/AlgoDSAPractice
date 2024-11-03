package com.arrays;

public class FreqCounter {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};

        int n = arr.length;

        // This loop iterate the every element
        for (int i = 0; i < n; i++) {

            int count = 0;

            // occurance of each element

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {

                    count++;


                }
            }


            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {

                    alreadyCounted = true;
                    break;
                }


            }

            if (!alreadyCounted) {

                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }


    }
}
