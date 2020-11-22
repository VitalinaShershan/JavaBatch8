package com.syntax.class12;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Write a java Program to print the second largest number in the array?
		 */

		int[] num1 = { 1, 5, 10, 3, 6};
		
		int length= num1.length;
		Arrays.sort(num1); // {1,3,5,6,10}
		System.out.println("Second highest number is " +num1[length-2]);
		
		//wtite a java program to find the second largest number in the array without using sort function
		
		
		System.out.println("----------------Another Way-------------");
		
		
		int[] myArray = { 1964, 45, 965, 65, 965, 32, 876, 900 };
		
		int max= myArray [0];
		int secondmax = 0;
		
		for(int i= 0; i< myArray.length; i++) {
			
			if(myArray[i]> max) {
				secondmax= max;
				max= myArray[i];
				
			} else if (myArray[i] > secondmax && myArray[i] != max ) {
				
				secondmax=myArray[i];
			}
			
		}
		
		System.out.println("Second highest number is " +secondmax);
		
		
		
		
		
	}

}
