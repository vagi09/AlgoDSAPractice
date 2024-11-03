package com.arrays;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {

        //decalre array
        int [] arr = {1,2,3,4,5};

        // Create new stack
        Stack <Integer> stack = new Stack<>();

        // push all the array values to stack
        for(int value: arr){

            stack.push(value);

        }

        // Pop all elements back to the array

        // the last element entered the stack comes out first

        for(int i =0 ; i<arr.length; i++){

            arr[i]= stack.pop();
        }

        System.out.println(Arrays.toString(arr));



    }
}
