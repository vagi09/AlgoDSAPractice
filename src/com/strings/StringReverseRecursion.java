package com.strings;

public class StringReverseRecursion {

    public static void main(String[] args) {


        String str = "hello";
//base cases.
//        System.out.println(str.isEmpty());
//        System.out.println(str.length());
//
//        System.out.println(str.charAt(str.length() - 1));

//        System.out.println(str.substring(0, str.length()-1));

        RevStr(str);


    }




    public static void RevStr(String str) {

        if (str.isEmpty() || str.length() == 1) {
            System.out.println(str);

            return;
        }

        System.out.println(str.charAt(str.length() - 1));

//        RevStr(str.substring(0, str.length() - 1));




    }


}


//printReverse("hello")
//|
//        |-- Print 'o'
//        |
//        |-- printReverse("hell")
//    |
//            |-- Print 'l'
//        |
//        |-- printReverse("hel")
//        |
//                |-- Print 'l'
//        |
//        |-- printReverse("he")
//            |
//                    |-- Print 'e'
//        |
//        |-- printReverse("h")
//                |
//                        |-- Print 'h' (Base case reached)
//        |
//        |-- Return
//            |
//                    |-- Return
//        |
//                |-- Return
//    |
//            |-- Return
//|
//        |-- Return
//
//Output: olleh