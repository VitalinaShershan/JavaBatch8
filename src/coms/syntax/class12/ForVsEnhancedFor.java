package coms.syntax.class12;

public class ForVsEnhancedFor {

	public static void main(String[] args) {
		// to print evrything from the last element
		
		
		int[] num= {10, 20, 30, 1}; // num.length=4
		                            // but 3 indexes, thats why -->  length-1
		
		for(int i=num.length-1; i>=0; i--) {
			
			System.out.print(num[i]+" ");
		}
		
		
		// Enhanced Loops goes only in one direction 
		// thats is why we can not go in the back direction,  we can not loop backward
		// it starts from the beginning of the loop and stops at the end

	}

}
