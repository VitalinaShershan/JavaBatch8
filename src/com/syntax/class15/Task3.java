package com.syntax.class15;

import java.util.Scanner;

public class Task3 {

    /*
        Write a program that reads two people's first names if they are
        expecting a boy or girl? Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Maria
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRIA
                Example Output:
        Mom’s first name? Maria
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String momsName, dadsName, gender, babyName;

        System.out.println("Mom’s first name?");
        momsName = scan.nextLine();

        System.out.println("Please enter dads name");
        dadsName = scan.nextLine();

        System.out.println("Is it a boy or a girl");
        gender = scan.nextLine();

        if (gender.toLowerCase().startsWith("b")) {
            String firstPart = dadsName.substring(0, dadsName.length() / 2); // first half from the fathers name
            String lastPart = momsName.substring(momsName.length() / 2); // second half from the moms name
            babyName = firstPart + lastPart;

        } else if (gender.toLowerCase().startsWith("g")) {

            String firstPart = momsName.substring(0,momsName.length() / 2);
            String lastPart = dadsName.substring( dadsName.length() / 2);
            babyName = firstPart + lastPart;
        } else {
            babyName = "No suggestions";
        }


        System.out.println(babyName);

    }
}
