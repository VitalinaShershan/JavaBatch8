package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskIterator {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that array list.
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator=numbers.iterator();
       while(iterator.hasNext()){
           if(iterator.next()%5==0){
               iterator.remove();
           }
       }
        System.out.println(numbers);
    }

}
