package homework;

public class magicNumber2 {
	 public static void main(String[] args) {
		    int myNumber=35;
		    int stepOne=myNumber*myNumber;
		    int stepTwo=stepOne+myNumber;
		    int stepThree=stepTwo/myNumber;
		    int stepFour=stepThree+17;
		    int stepFive=stepFour-myNumber;
		    int stepSixSet=stepFive/6;
		    System.out.println("The magic number is" + stepSixSet);
		    
}
}
