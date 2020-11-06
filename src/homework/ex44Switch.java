package homework;

import java.util.Scanner;

public class ex44Switch {

	public static void main(String[] args) {
		/*
		 * 
		 * Prompt user with questions: "Please enter your favorite car make"

if user enters  BMW -->  carOrigin = "german car"
if user enters  Toyota -->  carOrigin = " japanese car"
if user enters  Maserati -->  carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown" 
 
The output of your program should be:
"Your favorite car is ___"

		 */

		 Scanner scan;
		    String car;
		    String origin;
		    
		    scan=new Scanner(System.in);
		    System.out.println("Please enter your favorite car make");
		    car=scan.nextLine();
		    
		    switch(car.toUpperCase()){
		      
		      case("BMW"):
		        origin="german car";
		        break;
		      case("TOYOTA"):
		        origin="japanese car";
		        break;
		        case("MASERATI"):
		        origin="talian car";
		        break;
		        
		        default:
		        origin="unknown";
		        break;
		    }
		    
		    System.out.println("Your favorite car is "+origin);
		
	}

}
