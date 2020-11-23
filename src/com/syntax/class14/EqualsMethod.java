package com.syntax.class14;

public class EqualsMethod {

    public static void main(String[] args) {
        String name = "Sabeen";
        String name2 = "Sabeen";
        String name3 = "Eduard";
        // better to use Equals method ; with == can be issues

        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println();                   // no matter equals or ==

        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name == name3);

        System.out.println("-----------------------------------------------------------");

        name=new String("Sabeen");
        name2=new String("Sabeen");
        name3=new String("Eduard");


        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println();                   // no matter equals or ==

        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name == name3);



    }
}