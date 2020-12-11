package com.syntax.class30;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("Vitalina");
        names.add("Sherifa");
        names.add("Rihanna");
        names.add("Marina");
        names.add("Nikita");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Marina"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
