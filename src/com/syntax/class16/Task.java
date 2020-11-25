package com.syntax.class16;

public class Task {
    public static void main(String[] args) {
        /* write a program to reverse the contents of a string
        How would you reverse s String charachter by charachter
         */

        String str1 = "Anna";
        String reverse="";
        for(int i=str1.length()-1; i >=0;i--){
            System.out.println(i);
            reverse = reverse + str1.charAt(i);
            System.out.println(reverse);
        }
        System.out.println(reverse);
        System.out.println("Is " + str1 + " palindrome? " + reverse.equalsIgnoreCase(str1));


        StringBuilder stringBuilder=new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());
    }
}
