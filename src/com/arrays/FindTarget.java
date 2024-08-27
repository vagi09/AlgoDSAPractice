package com.arrays;

public class FindTarget {
    public static void main(String[] args) {

        int[] primes = {2, 3, 5, 7, 11};
        int target = 10;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == target) {
                System.out.println("Found at index " + i);
            }
        }



    }
}
