package coms.syntax.class12;

public class Q7 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 4 columns.
		//Develop a program which will identify/print the even numbers only
		
		
		int[][] array= {
				{3,5,6,},
				{78,6,9},
				{45,98,8}
		};
		

		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				if(array[i][j]%2 == 0) {
				
				System.out.print(array[i][j]+"  ");
			}
			}
			
			
			System.out.println();
		}
		
		 System.out.println("--------------Another LOOP--------------------");
		 
		 

			for(int[] arrays: array) {
				
				for(int lastArray: arrays) {
					if(lastArray%2 == 0) {
					
					System.out.print( lastArray+ " ");
				}
				}
				System.out.println();
			}
		 
		 
		 
	}

}
