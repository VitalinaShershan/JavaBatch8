package com.syntax.class21;

public class MoneerClass extends ParentClass {
// your money
    int money;

//money from your parents
    MoneerClass(int money){
        super(money);

    }

    void marry(){
        // if we have the same name method from paren class , we use this super keyword we
        // show that we refer tp parent class method
        super.marry();
        System.out.println(" i will marry katrina ok go marry her here is the money " + money);
    }

    public static void main(String[] args) {
        MoneerClass moneerClass= new MoneerClass(1000);
        moneerClass.marry();
    }

}
