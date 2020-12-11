package com.syntax.class26;

/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo;HP;Dell.

*/
class SmartMachine{
    public void smart(){
        System.out.println("I am a smart machine");
    }
}

public class Computer extends SmartMachine {
    String brand;
    public Computer(String brand) {
        this.brand = brand;//using this to differentiate between local and instance variable
        System.out.println();
    }

    public void run(){
        System.out.println(brand+" can run");
    }
    public void transfer(){
        System.out.println(brand+" can transfer data");
    }
    public void storage(){
        System.out.println(brand+" can store date");
    }

}
class Apple extends Computer{


    public Apple(String brand) {
        super(brand);
    }

    @Override
    public void run(){
        System.out.println("Runs faster");
    }

    public void storage(){
        System.out.println("Saves the data in a different way");
    }

    public void transfer(){
        super.transfer();
    }
}

class Lenovo extends Computer{

    public Lenovo(String brand) {
        super(brand);
    }

    public void tabletMode(){
        System.out.println(brand+" Can also be used as tablet");
    }
}
class HP extends Computer{

    public HP(String brand) {
        super(brand);
    }

    public void secure(){
        System.out.println(brand+ " can be unlocked with fingerprint");
    }
}