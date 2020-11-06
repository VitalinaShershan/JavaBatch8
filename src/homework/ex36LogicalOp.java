package homework;

import java.util.Scanner;

public class ex36LogicalOp {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	    System.out.println("Please enter two strings");
	    String word1=input.next();
	    String word2=input.next();
	    System.out.println("Please enter two numbers");
	    int int1=input.nextInt();
	    int int2=input.nextInt();
	    String bam=null;
	    
	    if (int1==int2 && word1==word2){
	      bam="AND";
	      
	    }else if (int1==int2 || word1==word2){
	      bam="OR";
	      
	    }else if (!(int1==int2 || word1==word2)){
	      bam="NONE";
	    }
	    System.out.println(bam);

	}

}
