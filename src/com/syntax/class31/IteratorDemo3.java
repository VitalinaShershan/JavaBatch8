package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(185.00);
       // doubleArrayList.add(15.00); CE error because we are checking after each two elements and trying to get the next two elements

        Iterator<Double> iterator = doubleArrayList.iterator();

        System.out.println("Before removal");
        System.out.println(doubleArrayList);

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
            System.out.println(iterator.next());

        }
    }
}
