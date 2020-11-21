package homework;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] grades=new int[5];
		grades[0]=98;
		grades[1]=53;
		grades[2]=67;
		grades[3]=88;
		grades[4]=77;
		
		int average=(grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		
		System.out.println("Average score of my students ="+average);
		
		int a=10;
		int b;
		b=10;
		
		
		double[] array;
		
		
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		//default value-when we forhet to put the value to the variable, so  automatically double =0.0, int=0, string=null
		System.out.println("Value of las element"+array[2]);
		
		
		array[2]=5.99;
		System.out.println(array[2]);
		
//		array[3]=7;  //ArrayIndexOutOfBoundsException: 3
		//System.out.println(array[3]);
		
		
		
		String[] liquid=new String[4];// arrays are fixed in size, you cant put later more than 4 variablrs
		
		liquid[2]="Water";
		liquid[1]="Tea";
		
		
		
		System.out.println(liquid[0]);
	}

}
