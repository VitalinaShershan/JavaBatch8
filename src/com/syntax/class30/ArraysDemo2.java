package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(105);
        arrayList.add(102);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        Integer integer = 100; //you can do this way or another
        System.out.println(arrayList.contains(integer));  //true

        System.out.println(arrayList.indexOf(100)); // we learn the index of the number, if we need
        arrayList.remove(integer);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.clear();
        System.out.println(arrayList);
    }
}
