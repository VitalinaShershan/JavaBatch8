package com.syntax.class14;

public class ConcatinationMethod {
    public static void main(String[] args) {
        String firstName="Ebrar";
        String lastName=" Gur ";
        String nameFriend="Burju Kaya";
        String name2=null;
        System.out.println(firstName+lastName+name2);// can add as many names as you need !! its recommended!!!
        String completeName=firstName.concat(name2); // can add only 1 variable
        System.out.println(completeName);


    }
}
