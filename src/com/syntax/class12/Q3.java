package com.syntax.class12;

public class Q3 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * series of numbers, in whic each number is the sum of the two preceding numbers.
		 * every next number is the sum of previos numbers
		 * 1,1,2,3,5,8,13,21,34,55,89 ... = Fibonacci numbers
		 */

		
		int a = 0;
		int b = 1;
		int sum;
		
		for(int i = 1; i<= 10; i++) {
			System.out.print(a+ " ");
			
			sum = a + b;
			
			//System.out.print(sum+ " ");
			a=b;
			b=sum;
		}
		
	}

}
