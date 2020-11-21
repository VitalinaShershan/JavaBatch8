package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// orint from 10 to 99
				for (int i=1; i<=9; i++) {
					
					for(int j=0; j<=9; j++) {
						System.out.println(i+""+j);
					}
					
				}

				System.out.println("-----------------------how can i print clock---------------------------");
				
				// 24 hours,60 minutes, 0:o1, 0:02, 0:59......1:01, 1:02
				
				
				for(int h=0; h<=24; h++) {
					
					
					for(int m =0; m<60; m++){
						
						
				
		if(h<10) {
							
						
	    if( m<10) {
		System.out.println("0"+h + ":0" + m);
		}else {
						
		System.out.println("0"+h + ":" + m);}
					
					
		}else {
					
		if( m<10) {
		System.out.println(h + ":0" + m);
		
		}else {
					
		System.out.println(h + ":" + m);}
		}
					
		
					
				}
				
				}
				System.out.println("-----------------------how can i print clock 2WAY---------------------------");


				for(int h=0; h<=24; h++) {
					
					
					for(int m =0; m<60; m++){
						
						if(h<10 && m<10) {
							System.out.println("0"+h + ":0" + m);
						}else if(h<10 && m>10) {
							System.out.println("0"+h + ":" + m);
						}
						
		              }
					
				}
				
				System.out.println("-----------------------how can I print car odometer---------------------------");
				
				for(int a=0; a<10; a++) {
					for(int b=0; b<10; b++) {
						for(int c=0; c<10; c++) {
							for(int d=0; d<10; d++) {
								 
									System.out.println(a+""+b+""+c+""+d);
								}
							}
						}
					}
				
				
				
				
				
				
	}

}
