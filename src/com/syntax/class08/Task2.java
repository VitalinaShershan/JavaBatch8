package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	/*
	 * Write a program that reads a range of integers(start and end point),provided by a user
	 *  and then from that range prints the sum of the even and odd integers.
	 * 
	 */
	Scanner scan=new Scanner(System.in);
	
	int sumE=0;
	int sumO=0;
	
	for(int i=100; i<=150; i++) {
		
		if(i%2==0) {
			sumE+=i;
		}else {
			sumO+=i;
		}
		System.out.println("the sum of even numbers from 100 to 150 is " +sumE);
		System.out.println("the sum of odd numbers from 100 to 150 is " +sumO);
	}
		
		
	}

}
