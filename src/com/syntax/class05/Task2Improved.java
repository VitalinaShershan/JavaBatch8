package com.syntax.class05;

import java.util.Scanner;

public class Task2Improved {

	public static void main(String[] args) {
		
		Scanner smart=new Scanner(System.in);
		System.out.println("Enter please your birthday's month");
		String month=smart.next();
		String season=null;
		
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
		season="Fall";
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Febreary")) {
			season="Winter";
		}else {
			System.out.println("Ivalid, please enter the right month");
		}
		System.out.println("You were born in " +season);

	}

}
