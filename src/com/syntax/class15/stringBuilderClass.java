package com.syntax.class15;

public class stringBuilderClass {
    public static void main(String[] args) {
// String ; StringBuffer; StringBuilder -- three diffrent ways
// string are not allowed to chamge their original content in original variable; otherwise in all other variables will be changed
        // 1 memore location for "cat" "cat" "cat"
        // 1 memore sell for the same content ; usa; usa usa usa --> all of them will be stored in one memory sell
        //stringbuilder not communicating with others; but it will be fast, but can be errors
        // stringbuffer communicate with each other; but can be costly; and time consuming

        // StringBuilders are used if your content in a variable will be changed-- > than use it
    StringBuilder stringBuilder= new StringBuilder("Hello world");
    stringBuilder.replace(0, stringBuilder.length(),"By");
    stringBuilder.append("world");
    String string="Hello";
    String string2="Hello";
    string.concat("World");
        System.out.println(string);
        System.out.println(stringBuilder);
    }
}
