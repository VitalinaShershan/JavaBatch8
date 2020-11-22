package com.syntax.class13;

public class Main {
    public static void main(String[] args) {

        Dog d1= new Dog();

        d1.size="big";
        d1.color="black";
        d1.breed="Labrador";
        d1.age=3;
        d1.name="Hasner";
        d1.isHealthy=true;
        d1.isFriendly=true;

        d1.bark();
        d1.eat();
        d1.sleep();


    }
}
