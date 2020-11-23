package com.syntax.class14;

public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        // it changes first the string in to same case , and then compares them
        String name1="Marta";
        String name2="MARTA";
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name2.equalsIgnoreCase(name1));
    }
}
