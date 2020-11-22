package com.syntax.class13;

public class IphoneSmartphone {
    public static void main(String[] args) {

        Smartphone sm1= new Smartphone();
        sm1.userName="Vitalina";
        sm1.brand="iphone";
        sm1.color="pink";
        sm1.model="11 Pro";
        sm1.appleId="Vitalina.love@gmail.com";
        sm1.passwordForAppleId=1234;
        sm1.call("+375296668924");
        sm1.dial();
       boolean login =sm1.loginApplestore("Vitalina.love@gmail.com", 1234);
        System.out.println(login);
        sm1.pics();
        sm1.text("Hello Darling");

    }
}
