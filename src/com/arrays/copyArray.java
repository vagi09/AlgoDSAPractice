package com.arrays;

public class copyArray {

    public static void main(String[] args) {

        // declare one array

//        int[] a = {1, 2, 3, 4, 5};
//
//        System.out.println("orginal Array");
//        for (int num : a) {
//
//            System.out.println(num);
//        }
//        ;
//
//        // declare new array with the same length of a
//        int[] CopyOf_a = new int[a.length];
//
//// copy all the elments for a to new array
//        for (int i = 0; i < a.length; i++) {
//
//            CopyOf_a[i] = a[i];
//        }
//
//        System.out.println("Copied Array");
//        for (int j = 0; j < CopyOf_a.length; j++) {
//
//            System.out.println();
//        }
//


        int [] SourceArray = {1,2,3,4,5};

        int [] DestinationArray = new int[SourceArray.length];

        System.arraycopy(SourceArray, 0, DestinationArray, 0, SourceArray.length);

        System.out.println("DestinationArray: ");
        for(int i: DestinationArray){
            System.out.println(i + " ");
        }





    }
}
