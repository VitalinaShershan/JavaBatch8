package com.syntax.class13;

public class BankApplication {
    public static void main(String[] args) {
//first it will create an acount and
// then it will store all the information
        Account burjusAccount = new Account();

        burjusAccount.accountId = "123";
        burjusAccount.userName = "Burju";
        burjusAccount.password = "pass123";
        burjusAccount.balance = 1000000;
        burjusAccount.typeOfAccount = "cheking";
        burjusAccount.limit = 125;

        boolean isLoggedIn = burjusAccount.login( "Burju",
                 "pass123");
        if(isLoggedIn){
            System.out.println("Welcome to Syntax bank");
        }else{
            System.out.println("Invalid user name or password");
        }


        double amountToTransfer=burjusAccount.amountTransfer(100);
        if(amountToTransfer==0){
            System.out.println("Insufficient balance");
        }else {
            System.out.println(amountToTransfer+" Transferred");
        }






        System.out.println(isLoggedIn);
        Account eliasAccount = new Account();
        eliasAccount.accountId = "125";
        eliasAccount.userName = "BElias";
        eliasAccount.password = "pass123";
        eliasAccount.balance = 15000;
        eliasAccount.typeOfAccount = "saving account";
        eliasAccount.limit = 100;

    }
}
