package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo5 {
    public static void main(String[] args) {
//delete "alchohol drinks" in  the list
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("soda");
        drinks.add("scoth");
        drinks.add("vodka");
        drinks.add("raki");
        Iterator<String> iterator = drinks.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next(); // extracted next method to a variavle, so no problem will erase, not calling it 3 ti,es at a time
            if (next.equals("scoth") || next.equals("vodka") || next.equals("raki")) {
                iterator.remove();
            }
        }
        System.out.println(drinks);

    }
}
