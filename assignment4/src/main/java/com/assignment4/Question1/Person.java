package com.assignment4.Question1;


public class Person {

    private String fName;
    private String lName;
    private String IDNumber;

    Person(String fName, String lName, String IDNumber)
    {
        this.fName = fName;
        this.lName = lName;
        this.IDNumber = IDNumber;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

}
