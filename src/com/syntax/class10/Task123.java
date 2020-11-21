package com.syntax.class10;

public class Task123 {

	public static void main(String[] args) {
		//create an array of chars and store grades into it: A,B,C,D,E,F. Thena print a grade B(use 2 different ways of creating an array)
		//first way
		System.out.println("------------------TASK1 1TH WAY----------------");
		
char[] love=new char[6];

love[0]='A';
love[1]='B';
love[2]='C';
love[3]='D';
love[4]='E';
love[5]='F';
System.out.println(love[1]);
System.out.println("------------------TASK1 2TH WAY----------------");


char[] trav= {'A','B','C','D','E','F'};

char secondValue=trav[1];


System.out.println(trav[1]);

int razmer=trav.length;
System.out.println("There are "+razmer);


System.out.println("------------------TASK2 2----------------");
// Create an array with 5 indexes:"Java","saturday","day","coding","is".  Print out the following--> saturday is Java coding day
String[] words= {"Java","saturday","day","coding","is"};
System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);


System.out.println("------------------------TASK 3----------------------");

//create an array of cars and store 6 elements into it.Print all values from the array


String[] cars= {"BMW","Mercedes","Toyota","Bently","Range rover"};

for(int i=0; i<cars.length; i++) {
	
	System.out.print(cars[i]+" ");
	
}
System.out.println();
System.out.println("-------------getting values from array using enhanced for loop------------");
/*
 * 
 * for(:name of the array)
 */

for(String car:cars) {
	System.out.print(car+" ");
}
System.out.println();
System.out.println("-------------getting values from array using enhanced for loop------------");


int[] numbers= {10,10,90,600,89};

for(int num:numbers) {
	System.out.println(num);
}


System.out.println();
System.out.println("-------------getting values from array using enhanced for loop------------");

boolean[] arrayOfBoolean= {true, true, false, true};

for(boolean boo: arrayOfBoolean) {
	System.out.println(boo);
}



System.out.println("------------------------TASK 4----------------------");

//create an array on integers and calculate the sum of all elements in an array

int[] array= {1,50,2,67,89};

int sum=0;
for(int num: array) {
	sum+=num;
}
System.out.println("The sum of the numbers in this array is :"+sum);

System.out.println("------------------------TASK 4 ANOTHER LOOP----------------------");

int sum1=0;
for(int a=0; a<array.length; a++) {
	
	sum1+=array[a];
}
System.out.println("The sum of the numbers in this array is :"+sum1);



System.out.println("------------------------TASK 5----------------------");

// create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.



String[] animals= {"cow","elephant","cat","dog"};

for(int i=0; i<animals.length; i++) {
	
	System.out.print(animals[i]+" ");
}


System.out.println();
System.out.println("------------------------ ENHANCED LOOP----------------------");


for(String live: animals) {
	
	System.out.print(live+" ");
}

System.out.println();
System.out.println("------------------------TASK 6----------------------");


//Create an array of countries.While retreiving all values from an array print capital for each country.(use 2 different loops)

String[] countries= {"France","Germany","USA"};

for(String country: countries) {
	if(country.equals("USA")) {
		System.out.println("The capital of "+country+" is  Washington DC");
	}else if(country.equals("France")) {
		System.out.println("The capital of "+country+" is Paris");
	}else if(country.equals("Germany")) {
		System.out.println("The capital of "+country+" is Berlin");
	}
	
	}



System.out.println("------------------------ANOTHER LOOP----------------------");

for(String country: countries) {
	String capital;
	switch(country) {
	
	case "USA":
		capital="DC";
		break;
	case "France":
		capital="Paris";
		break;
	case "Germany":
		capital="Berlin";
	break;
	default:
		capital="I dont know";
	
	}
	System.out.println("Capital of the "+country+" is "+capital);
}

System.out.println("------------------------ COUNTRIES AND CAPITALS ANOTHER WAY----------------------");
// thsi only cab be used when the sequence is the same way, otherwise country and capital will not match
String[] countrys= {"USA","Canada","Belarus"};
String[] capitals= {"Ottawa ","Minsk","DC"};

for (int v = 0; v< countries.length; v++) {
	System.out.println("The capital of "+ countrys[v]+" is "+capitals[v]);
}
	}

}
