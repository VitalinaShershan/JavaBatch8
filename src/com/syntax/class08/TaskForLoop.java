package com.syntax.class08;

import java.util.Scanner;

public class TaskForLoop {

	public static void main(String[] args) {
	
		
	int sum=0;
	
	for(int i=1; i<6; i++) {
		
		sum=sum+i;
	}
	
	System.out.println(sum);
	System.out.println("-------------------------------------------------------------------------------");
		
	int a;
	for(a=1; a<6; a++) {
		
		System.out.println("Value of a isnside the the loop " +a);
	}
	
	System.out.println("Value of a outside of for loop " +a);
		
	System.out.println("-------------------------------------------------------------------------------");
		
		int result=1;                 //     10-2=8-2=6-2=4-2=2-2=0  i>=1 , condion ger worse
		 for(int i=10; i>=1; i-=2) { // 1*10=10|  10*8=80|  80*6=480| 480*4=1920| 1920*2=3940
			 result*=i;
			 
			 System.out.println("Result =" +result); //10,80,489,1920,3840
		 }
		
	
		 
		 System.out.println("--------------------NEW TASK--------------------------------------------");
		//Calculate sum of even and odd numbers from range 1 to 50
		
		
		 int sumO=0;
		 int sumE=0;
		 
		 for(int n=1; n<51; n++) {
			 if(n%2 == 0) {
				 sumE+= n;
			 }else {
				 sumO+= n;
			 }
			 
		 }
		
		System.out.println("The sum of even number from 1 to 50 is " +sumE);
		System.out.println("The sum of odd number from 1 to 50 is " +sumO);
		
		
		 System.out.println("--------------------NEW TASK--------------------------------------------");
		
		//i want to create a multiplication table
		 
		 /*
		  * 1x1=1
		  * 1x2=2
		  * 1x3=3
		  * 
		  * 1x10=10
		  * tablicza umnozhenia
		  */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter whivch number");

		 int num1=scan.nextInt();
		 int mult;
		 for( int i=1; i<=10; i++) {
			mult=num1*i;
			 System.out.println(num1+" x "+i+" = "+mult);
		 }
		 
		 
		 
		 
		 
		 
	}

}
