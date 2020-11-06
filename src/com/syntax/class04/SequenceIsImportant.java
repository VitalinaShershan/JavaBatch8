package com.syntax.class04;

public class SequenceIsImportant {

	public static void main(String[] args) {
		// Always Debug to see the problem
		//The true amswer is (Good job), but beacse we executed not in the right order 
		//the result is wrong 
		//first (score>80), than (score>70)
		boolean assignment=true;
		int score=85;
		
		if (assignment) {
			if(score>90) {
				System.out.println("Great job!");
			}else if (score>70) {
				System.out.println("Pleaase study more");}
			else if (score>80) {
				System.out.println("Good job");
			
			}else {
				System.out.println("Good job for trying,but must study!");
			}
			
			
		}else {
			System.out.println("You should always complete all assignments");
		}
		

	}

}
