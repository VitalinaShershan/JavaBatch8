package com.syntax.class03;

public class CompoundOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		num=num+10;
		System.out.println(num);
		
		num=num+200;
		System.out.println(num);
		
		//to write in a shorter way we use compundOperator
		int myNumber=100;
		
		myNumber+=10;//110
		System.out.println(myNumber);
				
	myNumber+=200;//310
	System.out.println(myNumber);
	
	myNumber-=100;//210
	System.out.println(myNumber);
	
	myNumber/=10;//21
	System.out.println(myNumber);
	
	myNumber*=1000;//21000
	System.out.println(myNumber);
	
	myNumber%=100;//0
	System.out.println(myNumber);

	}

}
