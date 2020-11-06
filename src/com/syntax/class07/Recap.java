package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		

	String timeOfDay="Evening";
	String day="Friday";
	
	
	switch(timeOfDay) {
	
	case "Morning":
		System.out.println("Good Morning");
		
		if (day.equals("Saturday")) {
			System.out.println(" Class!");
		}else if (day.equals("Monday")) {
			System.out.println("Bla bla  nothing");
		}
		break;
		
	case "Evening":
		
		switch(day) {
		case "Thursday":
			System.out.println("Review class");
		case "Friday":
			System.out.println("NO class-Party");
		}
		break;
		
	case "Afternoon":
		System.out.println("Have a dinner");
		break;
		
		
		
		default:
			
			System.out.println("Enter a valid day time");
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

	}

}
