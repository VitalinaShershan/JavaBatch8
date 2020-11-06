package homework;

import java.util.Scanner;

public class ex41Switch {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program using the switch statement  
Let us consider the scenario regarding the born baby age 

First Output: "enter the age of the Child"

case 1: if age is 1 print as "You can Crawl"

case 2 : if age is 2 print as  "You can Talk"

case 3: If age is 3 print as "You can Dance"

case 4: if age is 4 print as "You can get  Trouble"

Other than this age (1-4) it should print "I don't know how old you are" 
		 */

		
		
		Scanner scan;
	    int age;
	    String output;
	    
	    scan=new Scanner(System.in);
	    System.out.println("enter the age of the Child");
	    age=scan.nextInt();
	    
	    switch(age){
	      
	      case(1):
	        output="You can Crawl";
	        break;
	        case(2):
	        output="You can Talk";
	        break;
	        case(3):
	        output="You can Dance";
	        break;
	        case(4):
	        output="You can get  Trouble";
	        break;
	        default:
	        output="I don't know how old you are";
	    }
	    System.out.println(output);
	    
	    
		
		
	}
	

}
