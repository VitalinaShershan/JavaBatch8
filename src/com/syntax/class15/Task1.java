package com.syntax.class15;

public class Task1 {

    /*
    Create a String and if the String is not empty perform the following:
           If the String has an odd number of characters and has 3 or more characters, print
           the character in the middle of the String.

     */
    public static void main(String[] args) {

//  7/2=3
        String string = "String";
        int length = string.length();
        if (!string.isEmpty()) {
            if(length>=3 && length%2==0 ){
                System.out.println(string.charAt(length/2)); //i    Str i ng

            }


        }
    }
}