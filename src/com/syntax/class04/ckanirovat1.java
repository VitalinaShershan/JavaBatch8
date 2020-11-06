package com.syntax.class04;

import java.util.Scanner;

public class ckanirovat1 {

	public static void main(String[] args) {
		/*
		 * 1)Create a Java program that will ask if user has 
		 * a credit card or not.
		 * 2)If user doesnt have a credit card than offer it.
		 * 3)If they do have one, ask what is the balance on the card?
		 * 4)If balance of the card is larger than 1000
		 * tell them to pay off immediately,
		 * otherwise you can tell them that they can spend more
		 * 
		 * 
		 * 
		 * SECOND WAY OF DOING THE PROGREM WITH STRING
		 * String answer=scan.next();
		 * if (answer.equals("yes")){
		 * ........}
		 * 
		 * if you donw want to have problem with Yes or yes in the console,than
		 * 
		 * 
		 * if(answer,equalsIgnoreCase("yes")
		 * no matter you will enter Yes with upper or lowCase 
		 */
	
		

	
	
	
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter if you have a credit card (true/false)");
	 
	Boolean answer= scan.nextBoolean();
	
//nestedIf
if (answer) {
	System.out.println ("What is the balance on your card?");
	double balance = scan.nextDouble();
	
	if (balance > 1000) {
		System.out.println("Please pay  off your card balance");
	}else {
			System.out.println("you can spend more $$");}
	
       }else {
		System.out.println("we would like offer you a credit card");
}
     
     

 
	
	}
}


	


