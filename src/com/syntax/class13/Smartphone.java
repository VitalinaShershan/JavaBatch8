package com.syntax.class13;




public class Smartphone {
    String userName;
    String brand;
    String color;
    String model;
    String appleId;
    int passwordForAppleId;
    boolean loginApplestore(String enteredappleId, int enteredpassword){
        if(appleId.equals(enteredappleId) && passwordForAppleId==enteredpassword){
            return true;
        }else{
            return false;
        }
    }

    void call(String phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }

   void text(String text){
       System.out.println(brand+model+ " sends text: "+text);
   }

    void dial(){
        System.out.println(brand+ " sending the text");
    }
    void pics(){
        System.out.println(brand+ " taking a picture");
    }
}
