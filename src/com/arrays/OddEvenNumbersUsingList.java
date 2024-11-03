package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumbersUsingList {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        printEvenOddNumbers(arr, evenNums, oddNums);

        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd numbers: " + oddNums);


    }

    public static void printEvenOddNumbers(int[] arr, List<Integer> evenNumbers, List<Integer> oddNumbers) {

        for (int numberInArray : arr) {

            if (numberInArray % 2 == 0) {

                evenNumbers.add(numberInArray);
            } else {

                oddNumbers.add(numberInArray);
            }
        }
    }
}
