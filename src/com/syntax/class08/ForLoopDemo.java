package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		// i want to say good morning 5 times
		/*
		 * 
		 * FOR SYNTAX
		 * 
		 * for (initialiyation;condition; increment/decrement){
		 * code;}
		 */
		for (int i=1; i<=5; i++) {
			
			System.out.println("Good Morning");
			// sequence 1)i=1; 2) i<=5; 3)System.out.println("Good Morning")  4)i++
		}

		
		/*
		 * i want to print number 1 to 100
		 * 
		 * for( start point; end point; increment/decrement){
		 * code;
		 * }
		 */
		
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("---------- I want to print number 10 to 0-------");
		
		for(int i=10; i>=0; i--) {
			System.out.print(i+" ");
			
		}
		
		
		System.out.println();
		System.out.println("-------------What will be the output?-----------");
		
		
		for (int i=0; i<=30; i+=3) {
			System.out.print(i+" ");
		}
		
		
		System.out.println("-------------------------------------------------");
		
		

		
		
		
		
	}

}
