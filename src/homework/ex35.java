package homework;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
	    
	     Scanner input=new Scanner(System.in);
	     System.out.println("Do you need a loan?");
	     boolean loan=input.nextBoolean();
	     String elig=null;
	     if(loan==true){
	       System.out.println("What is your credit score?");
	       int score=input.nextInt();
	       if(score<600){
	         elig="Not eligible";
	       }else if (score>=600 && score<700){
	         elig="Maybe eligible";
	       }else if(score>701 && score<800){
	         elig="Eligible";
	       }else if (score>801){
	         elig="Definitely eligible";
	       }
	       
	     }else {
	       elig="Unknown";
	     }
	     System.out.println("The eligibility is " +elig);
	  }

	}