package com.syntax.class25;



public class FinalMethodChildClass extends FinalMethodClass {




        double PI=4.5;
        @Override
        double add(double num1, double num2) {

            //  super.PI=45.;CE cannot change a final field
            // Math.PI;

            ;
            double add = super.add(num1, num2);
            super.printName();
            System.out.println("Results "+add);// adding our own fuctionality
            return add;
        }
  /*  public void printName(){
       //CE cannot override a final method
    }*/
// we can call the final method and use ut, but we can change it.

    }
