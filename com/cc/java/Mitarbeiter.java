package com.cc.java;

public class Mitarbeiter {
    protected String name;
    protected String firstName;
    protected int birthYear;
    public String workID;
    public String department;
    public String role;
   
     
    public Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void hasLunch() {
    System.out.println("Ich bin zur Mittagspause!");
    }

    public void startsWork() {
        System.out.println("Meine Arbeitszeit beginnt um 8 Uhr!");
    }
   
}
