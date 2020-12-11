package com.syntax.class26;

abstract public class Phone {
    // abstract classes can not have objects
    public void makeCalls(){
        System.out.println("Phone makes call");
    }
    public void sendText(){
        System.out.println("phone send txt");
    }
    public abstract void viewPicture();
    public abstract void unlock();

}
abstract class Iphone extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("We can checkout the photos using the photos app");
    }

    public void  unlock(){
        System.out.println("Why we need to out exactly same number of abstartc method?");
    }

}
class IphoneChild extends Iphone{
    @Override
    public void unlock() {
        System.out.println("Can unlock using face");
    }
}
class Samsung extends Phone{


    @Override
    public void viewPicture() {
        System.out.println("to view pictures use the Gallery app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock using a password");
    }
}
