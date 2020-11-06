package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read 3 inputs of scores(Quiz,mid term,
		 * and final term) and determine the grade, based on the folowing rules:
		 * If the average score >=90  then grade=A
		 * If the average score >=70 and <90 then the grade=B
		 * If the average score >=50 and <70 then the grade=C
		 * If the average score <50  then the grade=F
		 */
		
		Scanner love= new Scanner(System.in);
		System.out.println("Please enter the score of the Quiz");
		int quiz= love.nextInt();
		System.out.println("Please enter the score of the Mid Term");
		int midTerm= love.nextInt();
		System.out.println("Please enter the score of the Final");
		int finalTerm= love.nextInt();
		
		int avg=(quiz+midTerm+finalTerm)/3;
		System.out.println("Your average score is "+ avg);
		
		if (avg>=90) {
			System.out.println("Grade=A");
			System.out.println("You are a good student, you study a lot");
		}else if(avg>=70 && avg<90){
			System.out.println("Grade=B");
			System.out.println("You are a good student, you study a lot");
		}else if (avg>=50 && avg<70){
			System.out.println("Grade=C");
			System.out.println("Please study more");
		}else {
			System.out.println("Grade=F");
			System.out.println("Please study more");
		}
		
		
	}

}
