package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteraror2 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArraList=new ArrayList<>();
        integerArraList.add(10);
        integerArraList.add(20);
        integerArraList.add(30);
        integerArraList.add(100);
        Iterator<Integer> iterator= integerArraList.iterator();//return an object of the class that used iteraror interface
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
