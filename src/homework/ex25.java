package homework;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	 if (num>=1) {
	  	   System.out.println(num+" is positive");
	  	 }else if (num<=-1){
	  	   System.out.println(num+" is negative");
	  	 }
	  	 else {
	  	   System.out.println("Entered number is equals to " +num);
	  	   
	  	 }

	}

}
