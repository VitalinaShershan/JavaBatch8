package com.syntax.class22;

public class UserInfo extends UserClass {

/*Write program: userClass  that has a constructor
    that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable
    and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method.
    Test your code.*/

    String adress;
// 1 constructor
    UserInfo(String name,String mobileNumber,String adress){
        super( name, mobileNumber); //calling a constructor from a Parent class
        this.adress=adress;
    }


    void UserDetails(){
        System.out.println("User name is "
                +super.getName()+" has a phone number "
                +super.getMobileNumber() +" and lives in "+adress);
    }

    public static void main(String[] args) {
        UserInfo userInfo= new UserInfo("Vitalina","375256668924","Minsk,Belarus");
        userInfo.UserDetails();
        UserInfo userInfo1 = new UserInfo("Mike",
                "38237173913", "Brooklyn, NY");
    }
}
