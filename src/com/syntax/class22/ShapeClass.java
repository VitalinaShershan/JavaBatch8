package com.syntax.class22;

public class ShapeClass {
    /*
    Write a program: Shape class has a constructor that takes the radius and has
    a subclass circle class.In circle class create a method to calculate the area of circle.
    Test your code.
     */

    double radius;
    ShapeClass(double radius){
        this.radius=radius;
    }

    void print(){
        System.out.println(radius);

    }
}
