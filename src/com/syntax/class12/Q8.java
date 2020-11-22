package com.syntax.class12;

public class Q8 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers and calculate sum of all odd numbers.
		
		
		int[][] array= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int sum=0;
		
		for(int[] arrays: array) {
			
			for(int lastArray: arrays) {
				
				if(lastArray%2 != 0) {
				sum+=lastArray;
				
			}
			}
		
		}
		System.out.println("The Sum of odd  numbers is "+ sum);
		
	

		System.out.println("****2D Array Odd number*****");
		
		int sum1=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] % 2) != 0) {
					sum1 = sum1 + array[i][j];
				}
			}
		}
		System.out.println("Sum of all odd numbers " + sum1);

	}

}
