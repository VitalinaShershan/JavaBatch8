package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// sprosite pol'sovotelia kakoi browser ispolzyet 

		
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Safari browser";
			break;
		case "firefox":
			message="Your code will be executed on Safari browser";
			break;
			default:
				message="Entered browser is not supported";
		}
		System.out.println(message);
		// switch case cannot use relational operators(>,<,==) and logical operators (||,&&)
		//switch cannot work with double, float,long,boolean;
		
		float f=10.99f;
		double d=19.90;
		switch (d) 

}
