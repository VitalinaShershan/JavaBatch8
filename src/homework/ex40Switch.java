package homework;

import java.util.Scanner;

public class ex40Switch {

	public static void main(String[] args) {
		/*
		 * 
		 * By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

First Output: "Enter name of the instructor"

case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if the user provides any other names
		 */
		
		
		 Scanner scan;
		    String name;
		    String output=null;
		    
		    scan=new Scanner(System.in);
		    System.out.println("Enter name of the instructor");
		    name=scan.nextLine();
		    
		    switch(name){
		      case "Asghar":
		        output="Will take care of Java Assignment";
		        break;
		         case "Moazam":
		        output="Will take care of SDLC Assignment";
		        break;
		         case "Wegas":
		        output="Will take care of Selenium Assignment";
		        break;
		         case "Asel":
		        output="Will take care of every Assignmen";
		        break;
		        default:
		        output=" Invalid instructor selected";
		    }
		    System.out.println(output);
		    
	}

}
