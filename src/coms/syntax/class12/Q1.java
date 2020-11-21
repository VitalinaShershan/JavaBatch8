package coms.syntax.class12;

public class Q1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		//napishite programmy chtobi pomeniat 2 chisla bez vremennoi peremennoi
		
		int x=10;
		int y=20;
		
		x = y + x;//30
		y = x - y;//10
		x = x - y; //20
		
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);

	}

}
