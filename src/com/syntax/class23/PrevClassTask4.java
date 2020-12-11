package com.syntax.class23;


public class PrevClassTask4 {

     /*
    Create 1 class in which create a method that will calculate the area of
    Square
    Rectangle
    Use separate class to test your code
     */

    double getArea(double width){
        return width*width;
    }

    double getArea(double width, double length){
        return width*length;
    }

    public static void main(String[] args) {
        PrevClassTask4 prevClassTask4=new PrevClassTask4();
        System.out.println("Area of square "+prevClassTask4.getArea(10));
        System.out.println("Area of rectangle "+prevClassTask4.getArea(10,12));
    }
}
