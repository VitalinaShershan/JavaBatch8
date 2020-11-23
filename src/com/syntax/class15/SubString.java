package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {


        String name = "Can u write the second m too?";
        System.out.println(name.substring(10));// first 10 charachters will be ignored
        //System.out.println(name.substring(-1));//Error
        System.out.println(name.substring(0));// redundant // not needable
        System.out.println(name.substring(5,10)); // can you -- will be ignored // where 5- the begging and 11 is the end

        System.out.println(name.substring(6,11)+name.substring(15,22));//6- begging, 11-end



    }
}