package com.syntax.class14;

public class LengthMethod {
    public static void main(String[] args) {

        // strength method from the String Class

        String name="Qasim";
        //theres non length proreprties; only method
        // for non primitive data types we have methods

        System.out.println(name.length());

        name="";
        System.out.println(name.length());

        name="Ahmed Qasim";
        System.out.println(name.length());

        name="    Qasim     ";
        System.out.println(name.length());

        if(name.length()>10){
            System.out.println("you are great");
        }
    }
}
