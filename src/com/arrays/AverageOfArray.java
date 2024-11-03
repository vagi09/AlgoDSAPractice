package com.arrays;



public class AverageOfArray {


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        System.out.println(findAverage(arr));
    }

    public static double findAverage (int [] arr){

        int ArraySum =0;
        int n = arr.length;

        for (int i =0; i<n; i++){

            ArraySum += arr[i];
        }


        double Avg = (double) ArraySum/n;


//        return Avg;

        return (double) ArraySum/n;
    }


}
