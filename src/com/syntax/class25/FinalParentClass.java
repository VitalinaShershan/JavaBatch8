package com.syntax.class25;

 public class FinalParentClass {
// if it were Final public class FinalParent class, than NaughtyChild coudnt have inherit from this class
    String name;

    public FinalParentClass(String name) {
        this.name = name;
    }
    public void printName(){
        System.out.println("Name"+name);
    }
}
