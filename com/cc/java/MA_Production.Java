package com.cc.java;

public class MA_Production extends Mitarbeiter {
    
    public MA_Production(String name, String firstName, int birthYear, String workID, String role){
        super(name, firstName, birthYear, workID, role);
    }

    public void doYourWork(){
        System.out.println("I am working for real!")
    };