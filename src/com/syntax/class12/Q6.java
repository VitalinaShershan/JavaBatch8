package com.syntax.class12;

public class Q6 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.
		
		int[][] array= {
				{3,5,6,},
				{78,6,9},
				{45,98,8}
		};
		

		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				System.out.print(array[i][j]+"  ");
			}
			
		System.out.println();
		}
		
		
		System.out.println("------------------Secong Way Another Loop------------");
		
		for(int[] arrays: array) {
			
			for(int lastArray: arrays) {
				
				System.out.print( lastArray+ " ");
			}
			System.out.println();
		}
	}

}
