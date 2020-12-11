package com.syntax.class24;

public class VarArgs {
// using this "..."  VarArgs when we dont know how many elements we want to pass, so later in printing we can
    //put as many as we like // it gives more flexibility for the users


    // void print(int ...a){
    //   for( int numberInArray: a) {
    //       System.out.println(numberInArray);
    // }
    //  }


    //
    void print(int... array) {

        for (int numberInArray : array
        ) {
            System.out.println(numberInArray);
        }
    }

    public static void main(String[] args) {
        new VarArgs().print(1,2,3);
/*
THE SAME; JUST WE DON'T STORE IT INSIDE THE VARIABLE
VarArgs varArgs=new VarArgs();
        varArgs.print(1);
        varArgs.print(1,2);
        varArgs.print(1,50,98);
 */
    }
}
