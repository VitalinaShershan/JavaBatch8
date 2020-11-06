package homework;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1= 500.4444;
		//1th way
		   long mynum1=(new Double(num1)).longValue();
		 //2nd way  
		   long mynum2=(long) num1;
		   //3rd way
		   long mynum3=Math.round(num1);
		   
		    
		    System.out.println(mynum1);
		    System.out.println(mynum2);
		    System.out.print(mynum3);
		    
	}

}
