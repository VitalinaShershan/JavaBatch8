package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterarorDemo {

    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(15.00);

        System.out.println("Before removal");
        System.out.println(doubleArrayList);
        Iterator<Double> iterator=doubleArrayList.iterator();
        while(iterator.hasNext()) {

            if (iterator.next() < 20) {
                iterator.remove();
            }
        }
        System.out.println("After removal");
        System.out.println(doubleArrayList);


        ArrayList<Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(56);
        integerArrayList.add(76);
        integerArrayList.add(55);
        integerArrayList.add(5);

        System.out.println("Before removal"+ integerArrayList);
        Iterator<Integer> integerIterator= integerArrayList.iterator();
        while(integerIterator.hasNext()){
            if(integerIterator.next()%2==0){
                integerIterator.remove();
            }
        }

        System.out.println("After removal"+integerArrayList);
    }
}


