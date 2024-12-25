package com.arrays;

public class NextGreaterelement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25};
        findNGE(arr);

    }

    public static void findNGE(int [] arr){

        int n = arr.length;

        for (int i =0; i<n; i++){

            int nextGreater = -1;


            for (int j =i+1; j<n ; j++){

                if(arr[j] > arr[i]){

                    nextGreater = arr[j];
                    break;


                }
            }

//            Print the current element and its NGE
            System.out.println(arr[i] + " -> " + nextGreater);
        }

    }
}
