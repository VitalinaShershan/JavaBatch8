package com.syntax.class31;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> LinkedHashSet=new TreeSet<>();
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Kiwi");
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("strawberry");
        LinkedHashSet.add("avacado");
        LinkedHashSet.add("olives");
//  [Apple, Kiwi, Mango, avacado, olives, strawberry]
        System.out.println(LinkedHashSet);

        Set<Integer> LinkedHashSet2=new TreeSet<>(); // tree set goes from smalles to largest
        LinkedHashSet2.add(10);
        LinkedHashSet2.add(20);
        LinkedHashSet2.add(100);
        LinkedHashSet2.add(100);
        LinkedHashSet2.add(5);

//[5, 10, 20, 100]
        System.out.println(LinkedHashSet2);



    }
}
