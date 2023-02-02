package com.cc.java;

public class App {

    public static void main(String[] args) {

        //public MA_Accounting(String name, String firstName, int birthYear, String workID, String role)

        MA_Accounting maacc = new MA_Accounting("Muetze", "Max", 1989, "234456", "Abteilungsleitung");
        MA_Advertising maadv = new MA_Advertising("Muetze", "Maxine", 1992, "244456", "Bereichsleitung");
        MA_Production maprd = new MA_Production("Raschel", "Rudi", 1999, "334456", "Vorarbeiter");

        person(maacc);
        maacc.doYourWork();

        output("-----------------------");

        person(maadv);
        maadv.doYourWork();

        output("-----------------------");

        person(maprd);
        maprd.doYourWork();
    }

        //personalien ausgeben:
    private static void person(Mitarbeiter ma) {
            
            output("Name: " + ma.getName() +"," + " " + ma.getFirstName() + ", ID: " + ma.workID + ", Abteilung: " + ma.department);
            output("Ich bin " + ma.role);
            ma.startsWork();
            ma.hasLunch();
        }
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }




}
