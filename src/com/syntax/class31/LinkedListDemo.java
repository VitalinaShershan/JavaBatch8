package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {


        LinkedList<String> cities=new LinkedList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("New York");
        cities.add("San Diego");
        System.out.println(cities);


        // cities.removeIf(m -> m.endsWith("a"));
        Iterator<String> stringIterator = cities.iterator();
        while (stringIterator.hasNext()) {
            if (stringIterator.next().endsWith("a")) {
                stringIterator.remove();
            }
        }
        System.out.println(cities);
    }
}


