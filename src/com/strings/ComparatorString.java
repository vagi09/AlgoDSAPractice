package com.strings;

public class ComparatorString {

    public static void main(String[] args) {
        String[] names = {"Jithin", "Arunima", "Akhil", "Matthew", "Benjamin"};

//        Arrays.sort(names, Comparator.comparingInt(String::length));

//        System.out.println(Arrays.toString(names));

        for (int i =0; i<names.length; i++){

            System.out.println("Lenght of " + names[i] + " " +  names[i].length());
        }

    }
}
