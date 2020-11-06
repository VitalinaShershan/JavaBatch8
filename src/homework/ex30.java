package homework;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean isSunny;
		System.out.println("Is it sunny outside?");
		isSunny=scan.nextBoolean();

		if (isSunny){
		  System.out.println("It is a sunny day, I should go somewhere!");
		  System.out.println("What is the temperature outside?");
		int tempr=scan.nextInt();
		if (tempr>=85){
		  System.out.println("I am going to the beach!");
		}else{
		  System.out.println("I am going to the park");
		}
		}else {
		  System.out.println("I stay home and practice Java!");
		}

	}

}
