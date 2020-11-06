package com.syntax.class06;

import java.util.Scanner;

public class findLargestNumber {
	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	double num1,num2,num3,max;
	
	System.out.println("Please enter 3 numbers");
	num1=input.nextDouble();
	num2=input.nextDouble();
	num3=input.nextDouble();
	input.close();
	
	
	if(num1>num2 && num1>num3) {
		max=num1;
	}else if(num2>num3) {
		max=num2;
	}else  {
		max=num3;
	}
		
	System.out.println(max);
	
	
	System.out.println("------Comparing 2 numbers using nested if-------");
	//2nd way
	
	double biggest;
	if (num1>num2) {
		if(num1>num3) {
			biggest=num1;
		}else {
			biggest=num3;
		}
	}else {// nomer 2 bolshe nimera 1
		if (num2>num3) {
			biggest=num2;
	    }else {
				biggest=num3;
		}
	}
	
	
	
	
	
	}

}
