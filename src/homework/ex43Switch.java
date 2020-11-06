package homework;

public class ex43Switch {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.

case: 1 will display January

case: 12 will display December

Anything outside of 12 will display "Invalid"

Example Output:
Input a number between 1-12
Invalid

Example Output:
Input a number between 1-12
January
		 */

		
		Scanner scan;
	    int num;
	    String output;
	    
	    scan=new Scanner(System.in);
	    System.out.println("Input a number between 1-12");
	    num=scan.nextInt();
	    
	    switch(num){
	     case(1):
	       output="January";
	       break;
	        case(2):
	       output="February";
	       break;
	        case(3):
	       output="March";
	       break;
	        case(4):
	       output="April";
	       break;
	        case(5):
	       output="May";
	       break;
	        case(6):
	       output="June";
	       break;
	        case(7):
	       output="July";
	       break;
	        case(8):
	       output="August";
	       break;
	        case(9):
	       output="September";
	       break;
	        case(10):
	       output="October";
	       break;
	        case(11):
	       output="November";
	       break;
	        case(12):
	       output="December";
	       break;
	      default:
	      output="Invalid";
	    }
	    System.out.println(output);	
		
	}

}
