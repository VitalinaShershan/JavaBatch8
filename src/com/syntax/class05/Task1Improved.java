package com.syntax.class05;

import java.util.Scanner;

public class Task1Improved {

	public static void main(String[] args) {
		Scanner love= new Scanner(System.in);
		System.out.println("Please enter the score of the Quiz");
		int quiz= love.nextInt();
		System.out.println("Please enter the score of the Mid Term");
		int midTerm= love.nextInt();
		System.out.println("Please enter the score of the Final");
		int finalTerm= love.nextInt();
		
		int avg=(quiz+midTerm+finalTerm)/3;
		System.out.println("Your average score is "+ avg);
		char grade;
		
		if (avg>=90) {
			grade='A';
		}else if(avg>=70 && avg<90) {
			grade='B';
		}else if(avg>=50 && avg<70) {
			grade='C';
		}else if(avg>=40 && avg<50){
			grade='D';
		}else {
			grade='F';
		}
		
		if(grade=='A' || grade=='B') {
			System.out.println("You are good student");
		}else {
			System.out.println("Please study more");
		}
		
	}

}
