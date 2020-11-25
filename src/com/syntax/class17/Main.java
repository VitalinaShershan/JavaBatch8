package com.syntax.class17;

public class Main {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        String email = task1.createEmail("Vitalina", "Shershan", "gmail");
        System.out.println(email);


        System.out.println("-------------Task2-------------");




        Task2 task2 = new Task2();
        boolean prime = task2.isPrime(7);
        boolean prime1 = task2.isPrime(10);
        boolean prime2 = task2.isPrime(1);
        System.out.println("isPrime(7)" + prime);
        System.out.println("isPrime(10)" + prime1);
        System.out.println("isPrime(1)" + prime2);
        System.out.println("-----------------------------------------");

        Variables variables = new Variables();
        variables.varsDemo();
        variables.varsDemo1();

// properties are the same (name,age,marks) , but values are different;

        // all down will be stored in the the  memory; which is not that efficiant

        System.out.println("---------------------students-------------");
        Student qasim = new Student();
        qasim.name = "Qasim";
        qasim.age = 30;
        qasim.marks = 95;

        qasim.printInfo();
        qasim.StudentsRegistered();
        qasim.numbersOfStudentsEnrolled++;


        Student danilo = new Student();
        danilo.name = "Danilo";
        danilo.age = 30;
        danilo.marks = 90;
        danilo.numbersOfStudentsEnrolled++;

        danilo.StudentsRegistered();



        Student ilya = new Student();
        ilya.name = "Ilya";
        ilya.age = 34;
        ilya.marks = 80;
        ilya.StudentsRegistered();


    }
}
