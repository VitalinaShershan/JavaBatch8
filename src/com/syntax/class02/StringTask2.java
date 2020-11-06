package com.syntax.class02;

public class StringTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="OLga";
		
		// i would like to say: My name is Olga
		
		System.out.println("My name is "+name);// to attach anything use + sign
		
		String lastName="Sorrels";
		
		//i would like to print Olga Sorrels
		
		System.out.println(name+" "+lastName); // to put space between Olga and Sorrels +" "+
		
		String city="Miami";
		// olga lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		// olga is B student 
		System.out.println(name+" is "+grade+" student ");
		
		int age=21;
		// Olga is 21 years old
		System.out.println(name+" is "+age+" yers old ");
		//to attach/concatenate ANY value (char, int, String, double) to a String we use + (Sring concatenation operator)   
		
		 int date=27;
		 String month="September";
		 System.out.println(date+" "+month);
		 
		 String state="DC";
		 String anotherState="    DC";
				 // this two strings are different 1) no space after 2) there is space after DC
	}

}
