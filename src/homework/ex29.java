package homework;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		Scanner mrak= new Scanner(System.in);
	    System.out.println("Please enter the length");
	    int length=mrak.nextInt();
	    System.out.println("Please enter the width");
	    int width=mrak.nextInt();
	    
	    if (length==width){
	      System.out.println("The shape of your object is square");
	    }else {
	      
	      System.out.println("The shape of your object is rectangle");
	  
	    }

	}

}
