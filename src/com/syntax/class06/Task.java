package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println(" Skayhite est' li u vas segodnia rasprodazha ");
		boolean sale;
		double price,discount,finalPrice;
		
		sale=input.nextBoolean();
		
		
		if(sale==true) {
			System.out.println("We go for shopping");
			System.out.println("What is the price?");
			price=input.nextDouble();
					if (price>=10 && price<50) {
						discount=price*0.1;
					}else if(price>=50 && price<100){
						discount=price*0.2;
					}else if(price>=100 && price<500){
						discount=price*0.4;
				    }else if(price>=500){
				    	discount=price*0.5;
				    }else {
				    	discount=0;
					}
					finalPrice=price-discount;
					System.out.println("Your product price is $"+price+ " and you get §" +discount+ " discount and you pay only "+ finalPrice);
				
				}else {
					System.out.println("No Shopping!!");
				}
		
		
		
		

		
		
	}

}
