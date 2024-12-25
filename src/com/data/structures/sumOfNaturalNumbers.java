package com.data.structures;

public class sumOfNaturalNumbers {

    public static void main(String[] args) {

        int num = 5;

        System.out.println(sumOfnaturalNumRecursive(num));
    }


    public static int sumOfnaturalNumRecursive(int num) {

        if (num == 1) {

            return 1;
        }

        return num + sumOfnaturalNumRecursive(num - 1);
    }
}
