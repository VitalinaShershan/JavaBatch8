package com.syntax.class15;

public class ReplaceAll {

    public static void main(String[] args) {

        String mix = "3213Hello 89 World354545 *&***^&*^&*";

        System.out.println(mix.replaceAll("[0-9]", "")); // replace all the numbers from 0-9 to "whatever"

       System.out.println(mix.replaceAll("[a-z]", "")); // lower case letters will not be printed

         System.out.println(mix.replaceAll("[a-z A-Z]", "")); // remove all the letters ( Low or Upper Case)

        System.out.println(mix.replaceAll("[^A-Za-z0-9]", "")); // remove Low and Uppercase letters and numbers

        System.out.println(mix.replaceAll("\\s+", "")); // to replace space
    }

}
