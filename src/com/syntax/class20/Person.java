package com.syntax.class20;

public class Person {
    // not everyone has kids or salary;
    // thats why diferent constructors
    String name;
    String Adress;
    int age;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;
    // if i have 100 fields in class and 100 lines of code that i want to execute every time someone is creating an object of my class
    Person() {
        System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");

    }

    Person(String name, int age, String phone, double salary) {
        this();
        this.name = this.name;
        this.age = this.age;
        this.phone = this.phone;
        this.salary = this.salary;
        this.weight = 60;
        this.height = 5.4;
        System.out.println("I am the fisrt constructor i have only 4 fields as mandotory");
//i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids) {
        this();
        //this(name, age, phone, salary);
        this.numberOfKids = numberOfKids;
        this.martialStatus = martialStatus;
        System.out.println("I am the fisrt constructor i have only 6 fields as mandotory");

//i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/
    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education) {
        this();
        this.education = education;
        /*this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.martialStatus=martialStatus;     //if we dont use this keyword
        this.numberOfKids=numberOfKids;
        this.education=education;*/
        System.out.println("I am the fisrt constructor i have only 7 fields as mandotory");
        //i do not need these lines because i know how to use this() in java
        /*System.out.println(" These are important lines they must be executed each time a constructor is created");
        System.out.println(" These are important lines they must be executed each time a constructor is created");*/

    }

    Person(String name, int age, String phone, double salary, char martialStatus,
           int numberOfKids, String education, double height, double weight) {
        this(name, age, phone, salary, martialStatus, numberOfKids, education);
        this.weight = weight;
        this.height = height;

        System.out.println("I am the fisrt constructor i have only 9 fields as mandotory");
    }


    public static void main(String[] args) {
        Person person = new Person("KhaliqYar", 33, "12345678", 0, 'M', 0, "SDET", 5.7, 68);
        Person person1 = new Person("KhaliqYar", 33, "12345678", 0);
        Person person2 = new Person();

    }


}
