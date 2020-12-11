package com.syntax.class30;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListRemoveAll {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vitalina");
        names.add("Sherifa");
        names.add("Rihanna");
        names.add("Marina");
        names.add("Nikita");
        names.add("Masha");
        names.add("Sasha");
        names.add("Sergei");
        names.add("Timur");
        names.add("Taisa");


        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Masha");
        names2.add("Sasha");
        names2.add("Sergei");
        names2.add("Timur");
        names2.add("Taisa");


        names.removeAll(names2);
        System.out.println(names);
        //??????? didng understood the result
    }
}