package homework;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		Scanner kik= new Scanner(System.in);
	    System.out.println("Please enter 3 distinct numbers");
	    int num1=kik.nextInt();
	    int num2=kik.nextInt();
	    int num3=kik.nextInt();

	  
	     if (num1>=num2) {
	       if (num1>num3){
	        System.out.println("The largest number is " +num1);
	         
	       }else{
	         System.out.println("The largest number is "+num3);
	       }
	       
	       
	      }else if(num2>=num1){
	        if (num2>num3){
	          
	        System.out.println("The largest number is " +num2);}
	        else{ 
	          System.out.println("The largest number is "+num3); }
	       
	         }
	       }
	  }


