package com.syntax.class07;

public class RecapSwtchOr {

	public static void main(String[] args) {
		// if month is december or febreary or january---> winter;
		//if month is march or april or may --> spring;
		
		String month="March";
		
		switch(month) {
		
		case "December":
		case "January":
		case "Febreary":
			System.out.println("Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
		case "June":
		case "July":
		case "Augaust":
		
			System.out.println("Summer");
			break;
			
			
			
		}

	}

}
