package com.syntax.class30;

import java.util.ArrayList;

public class ArrayListClearAll {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vitalina");
        names.add("Sherifa");
        names.add("Rihanna");
        names.add("Marina");
        names.add("Nikita");
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
