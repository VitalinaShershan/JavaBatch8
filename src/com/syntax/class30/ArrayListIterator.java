package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vitalina");
        names.add("Sherifa");
        names.add("Rihanna");
        names.add("Marina");
        names.add("Nikita");
        System.out.println("Using enhanced for loop");
        for (String element:names  ) {
            System.out.println(element);
        }

        System.out.println("======================");
        System.out.println("Using Normal for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // get method will give use a name for each(i) index
        }

        System.out.println("======================");
        System.out.println("Using While loop");
        int index=0;
        while(index < names.size()){
            System.out.println(names.get(index));
            index++;
        }
        System.out.println("======================");
        System.out.println("Using Iterator");
        Iterator<String> iterator= names.iterator();

        while(iterator.hasNext()){  //false or true,it will run; untill it will execute all elemements
            System.out.println(iterator.next());
        }

    }
}
