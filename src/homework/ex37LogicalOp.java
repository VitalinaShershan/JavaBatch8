package homework;

import java.util.Scanner;

public class ex37LogicalOp {

	public static void main(String[] args) {
		
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Are you thirsty?");
		    boolean n1=scan.nextBoolean();
		    System.out.println("Are you sleepy?");
		    boolean n2=scan.nextBoolean();
		    String drink=null;
		    if (n1==true && n2==false){
		      drink="Water";
		    
		    }else if (n1==true && n2==true){
		      drink="Coffee";
		    
		    }else if (n1==false && n2==true){
		      drink="Tea";
		      
		    }else{
		      drink="Nothing";
		     
		    }
		    System.out.println("Looks like you need to drink "+ drink);
		    

		
		
	}

}
