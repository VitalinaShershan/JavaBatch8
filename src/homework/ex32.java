package homework;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		
		
	    
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter your gender: M or F");
	    String gender=scan.next();
	  
	    
	    if (gender.equals("M")) {
	      
	      System.out.println("Please enter your age");
	      int age=scan.nextInt();
	      if (age>=25){
	        System.out.println("Man");
	        }else{
	          System.out.println("Boy");
	        }
	      
	      }else {
	        
	        System.out.println("Please enter your age");
	      int age1=scan.nextInt();
	      if (age1>25){
	        System.out.println("Woman");
	        }else{
	          System.out.println("Girl");
	        }
	      }
	    
	    
	    
	  }
	  
	}