package com.syntax.class30;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vitalina");
        names.add("Sherifa");
        names.add("Rihanna");
        names.add("Marina");
        names.add("Nikita");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Masha");
        names2.add("Sasha");
        names2.add("Sergei");
        names2.add("Timur");
        names2.add("Taisa");
        names2.addAll(names);
        System.out.println(names.containsAll(names2)); //false
    }
}
