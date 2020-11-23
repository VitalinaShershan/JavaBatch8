package com.syntax.class16;

import java.util.Arrays;

public class ReverseWords {
    //How would you reverse a String word by word?
    public static void main(String[] args) {
        String sentence="Whta did u use the most?";
        String[] stringArray=sentence.split(" ");// will pick the sentence; and breack into arrays of words

        System.out.println( Arrays.toString(stringArray)); // we use method "Arrays.toString"-- building method

        //revers method is only available inside stringBuilder --> so use stringBuilder
            for( int i=0; i<stringArray.length; i++){

                StringBuilder stringBuilder =new StringBuilder(stringArray[i]);// convert a string to a stringBuilder
                // we put in brackets( what we want to be coverted to Builder( String type)); then we covert it;
                // and then we store it inside a new varibale
                System.out.println(stringBuilder);
                stringArray[i]=stringBuilder.reverse().toString();// we reversing; and then storing it back to a String
                System.out.println(stringArray[i]);
            }

        System.out.println(Arrays.toString(stringArray));
    }
}
