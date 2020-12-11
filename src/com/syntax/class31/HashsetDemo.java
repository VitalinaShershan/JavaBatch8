package com.syntax.class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetDemo {  // order is not mainted;  no duplication;
    public static void main(String[] args) {
        Set<String> hashSet= new HashSet<>();
        Set<String> LinkedHasSet= new LinkedHashSet<>();
        Set<String> treeSet= new TreeSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Srawberry");
        hashSet.add("Avocado");
        hashSet.add("olives");
        System.out.println(hashSet);
        //[Apple, Kiwi, olives, Srawberry, Mango, Avocado] output --> no insertion order while using HashSet
    }
}
