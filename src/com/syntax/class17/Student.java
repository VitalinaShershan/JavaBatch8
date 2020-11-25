package com.syntax.class17;

public class Student {
    // examle of instance variables
    String name;
    int age;
    double marks;
    // i want to keep info of how many students enrolled inside my course
     static int numbersOfStudentsEnrolled=10;


    public void printInfo() {

        System.out.println("Name" + name + "Age" + age + " Marks " + marks);
    }


    public void printInfo1() {
        System.out.println("Name" + name + "Age" + age + " Marks " + marks);
    }

    public void StudentsRegistered(){
        System.out.println("Total number of students up till now" +numbersOfStudentsEnrolled);
    }


}
