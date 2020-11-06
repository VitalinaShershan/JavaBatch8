package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {
		
		
		String day="Saturday";

		
		  if(day.equals("Saturday")){
		  System.out.println("My favorite Java class");
		  }
		  
		  
		  while(day.equals("Saturday")) {
		System.out.println("My favorite Java class");   //infinite
		 day="Sunday";
}
		  
		  // we can use logical opertors && and ||

		  System.out.println("------------------------------");
		  
		  
		  boolean isItBreakfast=false;
		  
		  if(isItBreakfast) {
			  System.out.println("I will get tea");
		  }
		  
		 
		  
		  while(isItBreakfast) {
			  System.out.println("I will get tea"); //infinite
			  isItBreakfast=false;
		  }
		  
	}

}
