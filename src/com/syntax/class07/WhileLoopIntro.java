package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
			 int time=15;
			  if (time>12)  { //condition is true
			  System.out.println("good day"); //code executes 1 time

			  }    
			  
			  
			  System.out.println("--------------WHILE LOOP---------------------------");
			  
			  //while (time>12)  {
			 // System.out.println("good day")//IFINITE LOOP
			   // }              
			  
			  
			  //while (time>12) {
				//  System.out.println("good day"); //how many times?  if num=15
				 // time++;//16,17,18,19,.... INFINIT LOOP
             //}
			  
			  
			  while (time>12)   {

			  System.out.println("good day");// How many times will be executed? 3 time ;;;will be printed if time=15, 
			  //(time--;) minus 1; 1) 15-1=14; 2)14-1=13; 3)13-1=12;
			  time--;
			  }         
			  
			 
			  // i want to print numbers from 1 to 59
			  
			  System.out.println(" PRINTING NUMBERS 1 TO 50------------");
			  
			 int num=1;
			 
			 while (num<51) {
				 System.out.println(num);
				 num++;
			 }
			 
			 
			 // i want to print numbers from 10 to 60
			 System.out.println(" PRINTING NUMBERS 10 to 60--------------");
			 
			 int a=10;
			  while(a<61) {
				  System.out.print(a+" ");
				  a++;
				  }
			  
			  
			  // i want to print numbers from 100 to 60
			  System.out.println("PRINTING NUMBERS FROM 100 TO 60---------------------");
			  
			  int b=100;
			  
			  while(b>=60) {
				  System.out.print(b+" ");
				  b--;
			  }
			  
			  
			  // i want to print numbers from 10 to 30 only even numbers
			  System.out.println("PRINTING NUMBERS 10 TO 30 ONLY EVEM------------------");
			  
			  int c=10;
			  
			  while(c<31) {
				  if(c%2==0) {
				  System.out.print(c+" ");
				  
				  // c++ --> if we keep increment here --> we will get infinite loop,the program will stop nonstop.
			  }
				  c++;// important to put this line at the end of while loop: at this place; 
				  }
			  
			System.out.println("-----Drugoi Sposob")  ;
			
			int d=10;
			
			while(d<30) {
				System.out.print(d+" ");
				d+=2;
			}
			  
			
			// print numbers from 100 to 1 (odd numbers only)
			
			System.out.println("---------NUMBERS FROM 100 to 1--------");
			
			int num3=100;
			
			while(num3>0) {
				
				if(num3%2!=0) {
					System.out.print(num3+" ");
					
				}
				num3--;
			}
			
}
}