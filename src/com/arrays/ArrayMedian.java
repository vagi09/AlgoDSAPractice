package com.arrays;

import java.util.Arrays;

public class ArrayMedian {

    public static void main(String[] args) {
        int[] oddArray = {3, 1, 5, 4, 2};
        //after sorting -> [1, 2, 3, 4, 5] - median is 3
        int[] evenArray = {3, 1, 5, 4, 2, 7};
        //after sorting -> [1, 2, 3, 4, 5, 7]
        System.out.println("Median of even Array:" + findMedian(evenArray));
        System.out.println("Median of odd Array:" + findMedian(oddArray));

    }

    /*
    First : Sort the Array.
   find the  length of an array

if length is even,
	- median is middle element i.e. length/2
if length is odd
	- median is average of two middle elements i.e n/2-1 and n/2
     */

    public static double findMedian(int[] arr) {

        Arrays.sort(arr);
        int length = arr.length;

        if (length % 2 == 0) {

            int mid1 = arr[length / 2 - 1];
            int mid2 = arr[length / 2];

            return (double) (mid1 + mid2) / 2;
        } else {
            return arr[length / 2];
        }
    }
}
