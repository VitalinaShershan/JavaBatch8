package com.syntax.class21;

public class DavitGrandParent {

    int money;
    DavitGrandParent(){
        System.out.println("Constructor from GrandParents");
    }

   DavitGrandParent(int money){
        this.money=money;
       System.out.println("Constructor from GrandParents to init money");
   }


    void print(){
        System.out.println("i have this money "+money);
    }
}
