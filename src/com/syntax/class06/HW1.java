package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter sales Amount");
		double sales=input.nextDouble();
		double comission;
		
		if (sales>=10 && sales<100) {
			comission=sales*0.1;
		}else if(sales>=100 && sales<200){
			comission=sales*0.2;
		}else if(sales>=200 && sales<500){
			comission=sales*0.3;
	    }else if(sales>=500){
			comission=sales*0.5;
	    }else {
			comission=0;
		}
		
System.out.println("You will get $" +comission+ " comission");


if (comission>1000) {
	System.out.println("You are an awesome seller");
	
}
	}

}
