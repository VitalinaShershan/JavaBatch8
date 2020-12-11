package com.syntax.class23;
/*
-Create a class 'Bank' and initialize an instance variable using constractor.
-Create in 'Bank' method 'printTransferFee' where you will take a commission 10% from the balance.
-Class 'Bank' should have two subclasses 'BOA' and 'Chase' banks.
-Change the commission fee from 10% to 1% in 'Chase' bank using override method
-Create two objects from 'Boa' and 'Chase' and call the methods.
 */
class Bank{
    // you can create a constructor automatically( right click on double; select Generate; click constructor)
    double bankBalance;
    public Bank(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    void printTransferFee(){
        System.out.println("Transfer Fee "+bankBalance*0.1);
    }

}

class BOA extends Bank{
// by clicking on red bulb you can automaticcaly create a new constructor (for super.variable)

    public BOA(double bankBalance) {
        super(bankBalance);
    }
}

class Chase extends Bank{

    public Chase(double bankBalance) {
        super(bankBalance);
    }

    void printTransferFee(){
        System.out.println("Transfer Fee"+bankBalance*0.01);
    }
}


public class OverridingExample{
    public static void main(String[] args) {
        Chase chase=new Chase(1000);
        chase.printTransferFee();
        BOA boa= new BOA(1000);
        boa.printTransferFee();

    }
}


