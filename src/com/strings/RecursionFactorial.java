package com.strings;

public class RecursionFactorial {

    public static void main(String[] args) {

        System.out.println(Factorial(5));


    }



    public static int Factorial(int n) {

        if (n == 0 || n == 1) {

            return n;
        }

        return n * Factorial(n - 1);
    }


}

//factorial(5)
//    |--> factorial(4)
//        |--> factorial(3)
//            |--> factorial(2)
//                |--> factorial(1) --> returns 1
//        |--> 2 * 1 = 2
//        |--> 3 * 2 = 6
//        |--> 4 * 6 = 24
//        |--> 5 * 24 = 120
