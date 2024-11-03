package com.JavaCollections;

import java.util.HashMap;
import java.util.Map;

// decalring HashMap
// adding key- pair values
// retriving key
//retrivng value
// iterating hashmap

public class LearnHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> fruitPrice = new HashMap<>();


        fruitPrice.put("Apple", 10);
        fruitPrice.put("Bananna", 20);
        fruitPrice.put("Cat", 30);
        fruitPrice.put("Dog", 40);
//        fruitPrice.remove("Dog");


    int applePrice = fruitPrice.get("Apple");
    System.out.println("price of apple: " + applePrice);

//    String appleStr = fruitPrice.get(10);

        boolean key = fruitPrice.containsKey("Apple");
        System.out.println(key);
        System.out.println("Fruit Prices:");

        for (Map.Entry<String, Integer> entry : fruitPrice.entrySet()) {

            System.out.println(entry.getKey() + "--> " + entry.getValue());


        }

        System.out.println("Size of the fruit: " + fruitPrice.size());

    }
}
