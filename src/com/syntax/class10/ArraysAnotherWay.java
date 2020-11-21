package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		
		
		String[] names= {"Mike","Burju","Jack","Danilo","Brayan","Evgenia"};
		
		//String[] name;
		//name={"Sabeen"}; you can not breack in two steos, and also you can not add another value later;all in one step
		
		
		System.out.println(names[3]);
		
		//how do i know how many elements i have in the array?
		int size=names.length;
		System.out.println("Size of names arrays "+size);
		System.out.println(names[names.length-2]);//Danila [3]
		
		int a=2;
		System.out.println(names[a]);//Jack [2]
		
		a+=2;
		System.out.println(names[a]); //Brayan
		
		for(int i=0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("---------------------------------------------------------------");
			
//for(int i=0; i <= names.length; i++) {  we will get an error because length will be 6 and highest index 5
//			
//			System.out.println(names[i]);
//		}
		
		
		
		for(int i=0; i <= names.length-1; i++) { 
			
			System.out.println(names[i]);
		}
		
	}

}
