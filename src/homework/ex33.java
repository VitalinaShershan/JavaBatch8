package homework;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Please enter a number");
	     int num=scan.nextInt();
	     int var1=2;
	     
	     
	     
	     if(num%var1==0){
	       System.out.println("Value is even");
	       
	      if (num>1000){
	        System.out.println("Even value is large");
	        
	      }else{
	        System.out.println("Even value is just right");
	      }
	     
	       
	       
	     }else{
	       System.out.println("Value is odd");
	     }
	    
	  }
	  
	}