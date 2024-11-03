package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// This type is applicable only for Integer Data type
public class ReverseArrayUsingCollections {

    public static void main(String[] args) {

        Integer [] arr = {1,2,3,4,5};

        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);

        System.out.println(list);



    }
}
