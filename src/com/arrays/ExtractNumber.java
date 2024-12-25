package com.arrays;

public class ExtractNumber {

    public static void main(String[] args) {
        String input = "abc38gh89";

        seperateStringNum(input);

    }

    public static void seperateStringNum(String input){

        StringBuilder num = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i =0; i<input.length(); i++){

            char ch = input.charAt(i);

            if(ch>='0' && ch <='9'){

                num.append(ch);
            }else {

                chars.append(ch);
            }
        }

        System.out.println("number: " + num.toString());
        System.out.println("chars: " + chars.toString());
    }
}
