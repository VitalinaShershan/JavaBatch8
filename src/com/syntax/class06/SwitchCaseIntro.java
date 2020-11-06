package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		

		
	 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter a day number");
		 int num1=scan.nextInt();
		String myDay;
		if (num1==1) {
		      myDay="Monday";
		    }else if (num1==2) {
		    	myDay="Tuesday";
		    }else if (num1==3) {
		    	myDay="Wednsday";
		    }else if (num1==4) {
		    	myDay="Thursday";
		    }else if (num1==5) {
		    	myDay="Friday";
		    }else if (num1==6) {
		    	myDay="Saturday";
		    }else if (num1==7) {
		    	myDay="Sunday";
		    }else  {
		    	myDay="Invalid day";
		    }
		System.out.println("Today is "+ myDay);
		System.out.println("------------ SAME EXAMPLEW USING SWITCH CASE ---------------------");
		String today;
		
		switch(num1) {//data type of variable must match with  datatype of case
		
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednsday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
			default:
				today="Invalid day";
		
			}
		
		System.out.println("Today is " +today);
		
		

	}

}
