package com.syntax.class06;

import java.util.Scanner;

public class SwitchHW1 {

	public static void main(String[] args) {
		/*
		 *  Ask user to enter their country and capture it.
		 *  Once values are captured print which language use speaks
		 *  
		 */
		
      Scanner scan=new Scanner(System.in);
      String country;
      String language=null;
      
      System.out.println("Please enter your country");
      country=scan.nextLine();
      
      switch(country.toLowerCase()) {
      
      case "belarus":
    	  language="russian";
    	  break;
    	  
      case "england":
    	  language="english";
    	  break;
    	  
      case "germany":
    	  language="german";
    	  break;
    	  
      case "france":
    	  language="french";
    	  break;
    	  
    	  case "spain":
        	  language="spanish";
        	  break;
      case "italy":
        	  language="italien";
        	  break;
      default:
		  language="not valid";
	  
    	 
      }
      
		System.out.println("Your country is "+country+ " and you speak "+language+" language");
		
	}

}
