package com.syntax.class19;

public class RecapTask1 {


    /*
    Create a method that will accept an array as parameters
    and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible
    by the creating an instance of the class.
     */


    /*
    double sumArray(double[] numbers){

    double sum= 0;
    for(int i=0; i<numbers.length; i++){

    sum= sum+ numbers[i];
    }

    return sum
    }

     */



  double sumArray(double[] numbers){

   double sum=0;
     for(double v : numbers){
         sum+=v;
     }
     return sum;
}


}