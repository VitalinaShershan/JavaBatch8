package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		
		int num=0;
		for(int i=1; i<=50; i++) {
			num+=1;
			if (num%3==0) {
				continue;
			}
			System.out.print(num+" ");
		}

		System.out.println("---------------------------TASK 2----------------------------------");
		//TASK 2
		//Create a programm that will keep asking user to apply for a credit card.
		// As soon as you get "yes" from a user program should stop asking.
		
		
		Scanner scan=new Scanner(System.in);
		String response;
		
		
		do {
			System.out.println("Do you have a credit card?");
			response=scan.nextLine();
			
		}while(!response.equalsIgnoreCase("yes"));
		System.out.println("You are selected");
		
		
		//TASK 3
		System.out.println("---------------------------TASK 3----------------------------------");
		
		/*
		 * Write a program that reads a range of integers(start and end point),provided by a user
		 *  and then from that range prints the sum of the even and odd integers.
		 * 
		 */
		
		System.out.println("please enter start point number");
		int startPoint=scan.nextInt();
		System.out.println("please enter end point number");
		int endPoint=scan.nextInt();
		
		int sumE = 0, sumO = 0;
		for(int i=startPoint; i<=endPoint; i++) {
			if(i%2 == 0) {
				sumE+=i;
			
			}else {
				sumO+=i;
			}
			
		}
		System.out.println("summ of Even is  " +sumE);
		System.out.println("summ od Odd is " +sumO);
		
		
		
		
		
		
	}

}
