package com.syntax.class06;

public class SwitcheEample {

	public static void main(String[] args) {
	String month="January";
	
	//if month is december-->febreary-->winter
	//if month is march or april or may-->spring
	

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
	case "August":
			System.out.println("Summer");
	    break;
	}
	}

}
