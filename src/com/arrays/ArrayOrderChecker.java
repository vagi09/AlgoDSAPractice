package com.arrays;

public class ArrayOrderChecker {

    // Enum to represent the order type
    enum OrderType {
        ASCENDING,
        DESCENDING,
        UNORDERED
    }

    public static OrderType checkArrayOrder(int[] arr) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                // If any element is smaller than the next, it can't be descending
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                // If any element is larger than the next, it can't be ascending
                isAscending = false;
            }

            // If it's neither completely ascending nor completely descending, return UNORDERED
            if (!isAscending && !isDescending) {
                return OrderType.UNORDERED;
            }
        }

        if (isAscending) {
            return OrderType.ASCENDING;
        } else if (isDescending) {
            return OrderType.DESCENDING;
        }

        return OrderType.UNORDERED;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = {1, 3, 2, 4, 5};

        System.out.println("Array1 is " + checkArrayOrder(array1));
        System.out.println("Array2 is " + checkArrayOrder(array2));
        System.out.println("Array3 is " + checkArrayOrder(array3));
    }
}
