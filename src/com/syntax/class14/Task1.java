package com.syntax.class14;

import java.util.Scanner;

public class Task1 {

    /*
    Accept username, passsword and confirm password from a user and check following requirements:

    1.Username and Password cannot be empty, if so-> message="Username and Password cannot be empty".
    2.Password should be minimum 8 characters, if less-> message="Password is too short".
    3.Password cannot contain username if so-> message="Password cannot contain user name".
    4.Password should match confirmed password, if not-> message="Password do not match".

    Only after all requirements met-> message= "Your username and passwords has been created".
     */
    public static void main(String[] args) {


        String username;
        String password;
        String confirmedpassword;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Username");
        username = scan.next();
        System.out.println("Please Enter Password");
        password = scan.next();
        System.out.println("Confirm Password");
        confirmedpassword = scan.next();

        if (username.isEmpty() || password.isEmpty()){
            System.out.println("Username and Password cannot be empty");
        }else{
            if(password.length()<8){
                System.out.println("Password is too short");
            }else{
                if(password.contains(username)){
                    System.out.println("Password cannot contain user name");
                }else{
                    if(!password.equals(confirmedpassword)){
                        System.out.println("Password do not match");
                    }else{
                        System.out.println("Your username and passwords has been created");
                    }
                }
            }
        }


    }
}
