package com.syntax.class13;

public class Account {

    String accountId;
    String userName;
    String password;
    String typeOfAccount;
    double balance;
    double limit;
    boolean isBlocked;
    // now we try to code the behavior of login behavior=method=function;  declating method
    //public void login()
    //"login" is a behaviour


    /*
    write a method that takes the amount that user wants to
     transfer it deducts the amount from your balance and
    returns the amount of transfer in case of success or a 0
    in case of failure
     */


     double amountTransfer(double amountToTransfer) {
        if(amountToTransfer<balance) {
            return balance=balance-amountToTransfer;
        }else {
            return 0;
        }
    }



    boolean login(String enteredUserName, String enteredPassword){

        if(userName.equals(enteredUserName) && password.equals(enteredPassword)){
          return true;
        }else {
            return false; // if someone enter wrong password or login
        }
    }
}
