package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAll {
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

        names.retainAll(names2); // only names2 will be remained
        System.out.println(names);

        int[] arr=new int[2];
        arr[0]=10;
        arr[1]=20;
        System.out.println(Arrays.toString(arr));
        arr[0]=20;
        System.out.println(Arrays.toString(arr));

    }
}