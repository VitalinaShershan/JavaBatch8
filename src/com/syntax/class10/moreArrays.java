package com.syntax.class10;

public class moreArrays {

	public static void main(String[] args) {
		char[] trav= {'A','B','C','D','E','F'};

		char secondValue=trav[1];
		
		for(int i=0; i<trav.length; i++) {
			
			char valueFromArray=trav[i];
			System.out.println(valueFromArray);
			
		}


		 int[] array={45, 78, 12,  67, 55, 89, 23, 77, 88};
		    
		    for(int i=1; i<array.length; i++){
		    
		      System.out.print(array[1]+" ");
		    i+=3;
		    }
		    
	}

}
