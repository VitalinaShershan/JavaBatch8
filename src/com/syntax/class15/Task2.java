package com.syntax.class15;

public class Task2 {
    /*
    Create a String and print it in reverse order(Sunday-yadnuS)
     */
    //------------------------------------------------


    /*
    Task1. 1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.
     */

    public static void main(String[] args) {

        String sentence=" Hello my dear Friend";
        System.out.println(sentence);
        String newString= sentence.replaceAll(" ","");
        System.out.println(newString);
        System.out.println(sentence);

        System.out.println("----------------------Another Task 2--------------------");

/*
            2. Create a String that should be combination of letters, numbers and special characters.
        Find out how many alpha characters are there in the String
         */


        String string= " a 1 b 2 c 3 d & * ! @ ";
        System.out.println(string);
        System.out.println(string.replaceAll("[^1-9]","")); // i want only this numbers nothing else
        System.out.println(string.replaceAll("[^1-9]","").length());

        System.out.println("----------------------Another Task 3--------------------");
        /*
             3. You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?
                " How would you find out how many sentences are in that String
         */

        String a1=" Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a1);
        System.out.println(a1.replaceAll("[\\sA-Za-z0-9]",""));
        System.out.println(a1.replaceAll("[\\sA-Za-z0-9]","").length());
    }

}
