package com.syntax.class06;

import java.util.Scanner;

public class SwitchHW2 {

	public static void main(String[] args) {
		/*
		 * Using Scanner class create calculator.
		 * Allow user to enter 2 numbers and operatir(+,-,*,/)
		 * Based on operator provide the result to user.
		 * 
		 * 
		 */

		
		Scanner scan;
		double num1;
		double num2;
		char operator;
		double result=0;
		

		scan=new Scanner(System.in);
		System.out.println("Please enter the fisrt number");
		num1=scan.nextDouble();
		System.out.println("Please enter one od the following operators: +, -, *, /");
		operator=scan.next().charAt(0);
		System.out.println("Please enter the second number");
		num2=scan.nextDouble();
		
		switch(operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			
			}
		
		
		System.out.println(num1+" "+operator+" "+num2+" = "+result);
	}

}
