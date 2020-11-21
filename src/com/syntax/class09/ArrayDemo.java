package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int a=10;
		
		a=29;
		
		//int student1=97;
		//int student2=88;
		//int student3=47;
		//int student4=56;
		//int student5=24;
	
		int[] num=new int[5];
		
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//to access element from  an array?
		
		System.out.println("Accesing 3 element"+num[3]);
		System.out.println(num[1]+num[4]);
		
		//i would like to change 50 to 100;
		
		num[4]=100;
		
		System.out.println("Value of 5th element after change"+num[4]);
		
		int[] array1=new int[2];
		//array[0]=10.99; CE,; type of value must be integer
		
		String[] array= new String[4];
		array[0]="Hello";
		
		
	}

}
