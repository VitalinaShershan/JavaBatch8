package com.syntax.class30;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddAll {
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
        names2.addAll(2,names);// [Masha, Sasha, Vitalina, Sherifa, Rihanna, Marina, Nikita, Sergei, Timur, Taisa]
        // we specified index 2, that means from second index should start added ArrayList
        System.out.println(names2);
        Collections.sort(names);


    }
}