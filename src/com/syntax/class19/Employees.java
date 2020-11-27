package com.syntax.class19;

public class Employees {

    int age;
    String name;
    char grade;

    Employees() {
        System.out.println("I will be called everytime you create an object of this class");
    }

    Employees(int ageValue, String nameValue, char characterValue) {
        System.out.println("I am not a uselesss constructor, i am initializing your fields");

        if (ageValue > 60 | ageValue < 18) {
            System.out.println("you should not be working please retire or wait to be 18 years old");

        } else {

            age = ageValue;
        }

        if (nameValue.length() > 25) {
            System.out.println("Please use short names like Aladin");
        } else {
            name = nameValue;
            grade = characterValue;
        }
    }
    void print() {
        System.out.println("Number " + age + " name " + name + " character " + grade);
    }

    public static void main(String[] args) {

        Employees employee1 = new Employees();
        employee1.age = 200;
        employee1.grade = 'M';
        employee1.name = "Davitt";
        System.out.println(employee1.age);

        Employees employee2 = new Employees(5, "Vlad", 'A');
        System.out.println(employee2.age);
        //constructors.print();
        // Constructors-- name of the class
        // constructors - name of the variable
        // = - assignment
        // new - by specifying "new" we tell to Java that we want an Object
        //Constructors() - those pair of () is called constructore; its purporse to initialize our fields
        // initializing number= 0; name= null; automaticaally


    }

}
