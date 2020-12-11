package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        Iterator<Double> iterator= doubleArrayList.iterator();
        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());  //18.99
        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());    //15.90
        System.out.println(iterator.hasNext());//true
        System.out.println(iterator.next());   //150.50
       // System.out.println(iterator.hasNext());   // false
       // System.out.println(iterator.next());      //Error Because we are at the last index and there are no more elements left
    }
}
