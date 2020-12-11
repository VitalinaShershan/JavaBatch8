package com.syntax.class29;


public class PersonTester {
    public static void main(String[] args) {
        Person davitObj = new Person("Davit", "123456789", 25, 30000);
        Person mikeObj = new Person("Mike", "987654321", 30, 750);
     Person daniloObj=new Person("Danilo","56754747",30,2000);
      /*  System.out.println(davitObj.taxPaid);
        davitObj.taxPaid=0;
        System.out.println(davitObj.taxPaid);
        */
        davitObj.setTaxPaid("45763111", -1);
        davitObj.setTaxPaid("123456789", -1);
        System.out.println(davitObj.getTaxPaid("45641351"));
        System.out.println(davitObj.getTaxPaid("123456789"));

        //Mike
        mikeObj.setTaxPaid("987654321",56);
        System.out.println(mikeObj.getTaxPaid("6275472465"));
        daniloObj.setTaxPaid("56754747",720);
        System.out.println(daniloObj.getTaxPaid("56754747"));


    }

}
