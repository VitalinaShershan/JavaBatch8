package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo4 {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("New York");
        cities.add("San Diego");
        System.out.println(cities);


        cities.removeIf(m -> m.endsWith("a"));  //Lambda expression. M is just a name of a variable, it can be s,d,f,g, whatever



       // Iterator<String> stringIterator= cities.iterator();
       // while (stringIterator.hasNext()){
        //    if(stringIterator.next().endsWith("a")){
         //       stringIterator.remove();
         //   }
      //  }
        System.out.println(cities);
    }
}
