package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the day of the week");
		String newday= input.next();
		
		
		if (newday.equals("Saturday") || newday.equals("Sunday"))
		{
			System.out.println("Today is java class");
		}
			System.out.println("The end");
		
			System.out.println("-----------more examples---------");
			
			/*
			 * if day is 1 or 5 --> i am off from Syntax
			 * if day 2 or 3 ---> GIT class
			 * if day 4 ---> Review class
			 * if day 6 or 7 ---> Java class
			 * Everything else --> invalid day
			 */
			
			Scanner love= new Scanner(System.in);
			System.out.println("Please enter todays day using numbers only from 1 to 7");
			int number= love.nextInt();
			
			if (number==1 || number==5) {
				System.out.println("I am off fron Syntrax");
				}else if (number==2 || number==3) {
					System.out.println("Git Class");
				}else if (number==4) {
					System.out.println("Review class");
				}else if(number==6 || number==7) {
					System.out.println("It is a Java class today");
				}else { 
					System.out.println("Invalid day");
				}
			
		
		
		
		
		
		
		
		

	}

}
