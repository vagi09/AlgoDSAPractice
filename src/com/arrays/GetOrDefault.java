package com.arrays;

import java.util.HashMap;

public class GetOrDefault {

    public static void main(String[] args) {

        /*
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Car", 3);
        map.put("Dog", 4);

        int bananaValue = map.getOrDefault("Apple", 0);
        int umbValue = map.getOrDefault("Umbrella", 0);

        System.out.println(bananaValue);
        System.out.println(umbValue);

         */

        String str = "racecar";

        HashMap<Character, Integer> map = new HashMap<>();

        for( char c : str.toCharArray()){

            map.put(c, map.getOrDefault(c, 0)+1);
        }

//        System.out.println(map);

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
