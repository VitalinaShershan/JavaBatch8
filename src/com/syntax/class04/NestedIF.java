package com.syntax.class04;

public class NestedIF {

	public static void main(String[] args) {
		/*
		 * variable for allergy -yes or no
		 * 
		 * if allergy is yes-->
		 *                 we will check if pet allergy
		 *                 if peanut allergy
		 *                 if polen allergy
		 * if no allergy you are lucky                
		 */

		boolean allergy=true;
		
		boolean petAllergy=false;
		boolean peanatAllergy=true;
		boolean pollenAllergy=false;
		
		
		
	if (allergy) {
		System.out.println("Lets do further check");
		if (petAllergy) {
			System.out.println("Please no cats or dogs in the house");
		
		
		} else if (peanatAllergy){
			System.out.println("Dont eat peanat butter");
		}else if (pollenAllergy) {
			System.out.println("Dont clean ");}
	}else {
		System.out.println("You are lucky");
	}
	
	System.out.println("-----------Example 2----------");
	
	/*
	 * If todays is friday we will watch movie but would like to check the date
	 *  if date is 13--> watching scary movie
	 *  and if its is not--> i will watch comedy, action
	 *  
	 *  if no Friday --> i am studying
	 */
	
	boolean Friday=false;
	int date=4;
	boolean monday=true;
	
	if (Friday) {
		if (date==13) {
			System.out.println("We will watch a scary movie");
		
		}else {
			System.out.println("Watch a comedy");
		}
		
		
	}else {
		
		if(monday) {
		System.out.println("I am not studying,Im working");
	}else {
		System.out.println("I have class at Syntax");
	}
	}
	
	System.out.println("----------Example 3------");
	/*
	 * check if assignment is completed
	 * if assignment is complited:
	 *                     if score >90--> great job
	 *                     if score >80--> good job;
	 *                     if score >70--> please study more
	 */
	
	boolean assignment=false;
	int score=92;
	
	if (assignment) {
		if(score>90) {
			System.out.println("Great job!");
		}else if (score>80) {
			System.out.println("Good job");
		}else if (score>70) {
			System.out.println("Pleaase study more");
		}else {
			System.out.println("Good job for trying,but must study!");
		}
		
		
	}else {
		System.out.println("You should always complete all assignments");
	}
	
	}

}
