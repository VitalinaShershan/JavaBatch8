package com.syntax.class09;

public class PrintingPattersBestWay {

	public static void main(String[] args) {
		
		
		for(int r=1; r<=4; r++) {
			
			for(int c=1; c<=6; c++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------6 riadov & 12 kolon--------------");
		
		
		for(int i=1; i<=6; i++) {  //this for rows (dlia riadov)
			for(int a=1; a<=12; a++) {   //// for colums kolonna
				System.out.print("$");
			}
			System.out.println();
		}
		
	
		System.out.println("--------------KVADRAT ЦIFR--------------");
		/*
		 * 12345
		 * 12345     rows=4; colomns=5   System.out.print(c);
		 * 12345
		 * 12345
		 */
		
		for(int r=1; r<=4; r++) {
			
			for (int c=1; c<=5; c++) {
				System.out.print(r);   //11111
				                       //22222
			}                          //33333
			System.out.println();      //44444
		}                              //55555
		
		
		
		System.out.println("--------------KVADRAT ЦIFR--------------");
		/*
		 * 77777
		 * 66666
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		
for(int m=7; m>=1; m--) {
			
			for (int d=1; d<=5; d++) {
				System.out.print(m);   
				                       
			}                          
			System.out.println();      
		}                              
		
System.out.println("--------------KVADRAT ЦIFR--------------");

/*
 * 7654321
 * 7654321
 * 7654321
 * 7654321
 * 7654321
 * 
 */


for(int Q=1; Q<=5; Q++) {
	
	for (int S=7; S>=1; S--) {
		System.out.print(S);   
		                       
	}                          
	System.out.println();      
}                          







	}

}
