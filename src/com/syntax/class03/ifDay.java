package com.syntax.class03;

public class ifDay {

	public static void main(String[] args) {
		int num1=19;
		int num2=99;
		
		if (num1>num2) {
		System.out.println(num1+" is bigger than "+num2);
		}
		else if (num1<num2) {
			System.out.println(num1+ " is smaller than " +num2);
		}
		else  {
			System.out.println(num1+" is equel to" +num2);
		}
		

		System.out.println("------------------------------------");
		
		//Based on the day of the week we will print class schedule
		
int day=-99;
		
		if(day==1){
			System.out.println("Today is Monday we have no class");
		}
		else if (day==2) {
			System.out.println("Today is tuesday we have Manual class");
		}
		else if (day==3){
			System.out.println("Today is Wednsday and we have Manual class again");
		}
		else if(day==4){
			System.out.println("Today is Thursday and we have Review class");
		}
		else if(day==5){
				System.out.println("Today is Friday we have no class");
			}
		else if(day==6){
				System.out.println("Today is Saturday we have no class");
			}
		else if(day==7){
				System.out.println("Today is Sunday we have no class");
			}
		else {
			System.out.println("This is invalid day entry, please provide valid day from 1 to 7");
		}
		

	}

}
