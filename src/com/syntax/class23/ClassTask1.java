package com.syntax.class23;

public class ClassTask1 {

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}


/*
-Create a class 'Degree' having a method'getPrerequisite'that prints "To get a a degree you need a high school diploma"
-Class 'Degree' has two subclasses namely 'Bachelors' and 'Masters'.
-In 'Masters' class override method 'getPrerequisite'.
-Call the method by creating an object of each of the three classes.
 */


class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree{

}

class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need Bachelors diploma");
    }

}