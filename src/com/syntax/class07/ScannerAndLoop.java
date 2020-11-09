package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// Ask user what is his name 5 times ---> hello +name 
		// we try to perform repetative action
		
		
		Scanner scan;
		String name;
		
		
scan=new Scanner(System.in);
		int number=1;
		
		while(number<=5) {
        System.out.println("Please tell me your name");
        name=scan.nextLine();
        System.out.println("Nice to meet you " +name);
        System.out.println("----------------------------");
        number++;
		}
		
		
		 System.out.println("----------------------------------------------------------------");
		
		//play a lottery where we need to enter number from 1 to 20
		 //lucky number is  7
		 //keep asking a user to enter a number until entered number is as same as lucky number
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
