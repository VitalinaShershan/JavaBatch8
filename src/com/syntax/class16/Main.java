package com.syntax.class16;

public class Main {

    public static void main(String[] args) {

        VoidMethods.print();
        VoidMethods.print("Excellen Aladin");

Task1.printLarger(10,20);
        Task1.printLarger(100.5,20);
        Task1.printLarger(10,10);


        System.out.println("-------If we dont use methos--------");



        //if we don't use methods; a lot to write; but the same output
        double number1=10;
        double number2=20;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }
        number1=100.5;
        number2=20.5;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }
        number1=10;
        number2=10;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }


        System.out.println("---------Task2 ---------");
        Task2 task2 = new Task2();

        task2.printNumberEvenOrOdd(5);
        task2.printNumberEvenOrOdd(2);
        task2.printNumberEvenOrOdd(10);
        task2.printNumberEvenOrOdd(1000);

        System.out.println("----------------Task3------------");

        Task3 task3=new Task3();
        task3.isStringpalindrome("aba");
        task3.isStringpalindrome("a");
        task3.isStringpalindrome("aeabea");
        task3.isStringpalindrome("Syntax");
        task3.isStringpalindrome("aopsjp");

        System.out.println("------------------Task4-----------------");

        Task4.sayHello("Turkey");

    }

}
