package com.syntax.class30;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> dynamicArray=new ArrayList<>();
        dynamicArray.add("Ali");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Muhammad");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Marina");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Nikita");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Rihanna");
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray);
    }
}
