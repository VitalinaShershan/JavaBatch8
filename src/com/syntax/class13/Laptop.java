package com.syntax.class13;

public class Laptop {
    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;
//what are the tasks that a laptop can do for us

    void playMovies() {
        System.out.println("playing movies");
    }

    void browseInternet() {
        System.out.println("browsing Internet");
    }

    void makeVideoCall(String contact) { // in paranthesis are " arguments"
        System.out.println("Video calling to " + contact);
    }

    public String getModel() {
        return model;
    }

    int getRAMCapacity(){
        return RAMCapacity*2;
    }

    int upgradeRam(int newRamUnit)
    {
       return newRamUnit*RAMCapacity;
    }

}