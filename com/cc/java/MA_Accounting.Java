package com.cc.java;

public class MA_Accounting extends Mitarbeiter {
    
    public MA_Accounting(String name, String firstName, int birthYear, String workID, String role){
        super(name, firstName, birthYear, workID, role);
    }

    //specific method
    public static void doYourWork(){
        return("I do the math!");
    }

    }