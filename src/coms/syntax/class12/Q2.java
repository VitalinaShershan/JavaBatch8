package coms.syntax.class12;

public class Q2 {

	public static void main(String[] args) {
		/*
		 *  Write a java program to check whether a given number is prime or not?
		 *  prime number( a) can be divisible only by itself; b) can be divisible by 1
		 *  1,2,3,5,7,11,13,,17,19,23,29,31,37,41,43.47,53,59,61,67,71,73,79,83,89,97
		 *  prostie chisla = prime numbers
		 */

		
		int num=13;
		
		boolean flag=false;
		
		 if (num>1) {
			 for(int i = 2; i < num; i++) {
				 //condition for nonprime
				 if (num % i == 0) {
					 flag = true;
					 break;
				 }
				 
			 }
		 }else {
			 flag = true;
		 }
		 
		 
		 
		 if(!flag) 
		      System.out.println(num + " is a prime number.");
		  else 
			 System.out.println(num + " is not a prime number.");
		 
	}

}
