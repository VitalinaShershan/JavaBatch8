package com.syntax.class11;

public class Task2Array {

	public static void main(String[] args) {
		
		/*Create a 2D array where you will store the following values: Mr,Mrs,Ms,Miss
		 * 
		 *and Smith,Jordan,Jackson,Obama
		 *After storing values print the following:
		 *Mrs Smith, Mr Obama, Ms Jackson,Miss Jordan
		 */
		
		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
				
		};
		
		System.out.println(names[0][0]+" "+names[1][0]);
		System.out.println(names[0][1]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		System.out.println("----------------------------------------");
		
		/*
		 * Create 2D array of cars: american, german, korean, italian.
		 * Then retrieve al values from that array using 2 different loops
		 */
		
		
		
		
		String[][] cars= {
				{"Jeep","Ford", "Dodge"},
				{"Audi", "Porshe","BMW"},
				{"Kia", "Hyundai","Hyundai Sonata"},
				{"Ferrari","Maserati","Lamborghini"}
				};
		
		
for(String[] carArray:cars) {
			
			for(String car:carArray) {
				System.out.print(car+" ");
				
			}
			System.out.println();
		}
		
		
		
		System.out.println("------------------------------------------------------");
		
		
for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				System.out.print(car+" ");
			}
			System.out.println();
		}
		
		
	}

}
