package com.arrays;

public class OddEvenNumsUsingForLoops {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printOddEvent(numbers);
    }

    public static void printOddEvent(int[] arr) {

        System.out.print("Even numbers: ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                System.out.println(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Odd Numbers");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                System.out.println(arr[i] + " ");
            }
        }


    }
}
