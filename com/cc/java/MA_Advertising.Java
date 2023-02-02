package com.cc.java;

public class MA_Advertising extends Mitarbeiter {
    
    public MA_Advertising(String name, String firstName, int birthYear, String workID, String role){
        super(name, firstName, birthYear, workID, role);
    }

    //specific method
    public static void doYourWork(){
        System.out.println("I do the ads!");
    }
}