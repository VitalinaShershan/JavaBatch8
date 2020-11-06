package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * write a program for user to enter his/hers birth month.
		 * Based on the month define the season.
		 * Example: if user is born in June,July or August
		 * -> season="Summer"
		 * At the end of the program we should see output as"You were born__"
		 */

		
		
		Scanner smart=new Scanner(System.in);
		System.out.println("Enter please your birthday's month");
		String month=smart.next();
		
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
		System.out.println("You were born in Fall");
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Febreary")) {
			System.out.println("You were born in Winter");
		
		
		
		}
		
		}

}
