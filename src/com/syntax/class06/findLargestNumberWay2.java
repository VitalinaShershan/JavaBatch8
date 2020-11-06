package com.syntax.class06;

import java.util.Scanner;

public class findLargestNumberWay2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double num1,num2,num3,max;
		
		System.out.println("Please enter 3 numbers");
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		input.close();
		
		if (!(num1==num2 && num2==num3)) {
			if(num1>num2 && num1>num3) {
				max=num1;
			}else if(num2>num3) {
				max=num2;
			}else  {
				max=num3;
			}
			System.out.println("The largest number is " +max);
		}else {
			System.out.println("Numbers are equal");
		}
	}

}
