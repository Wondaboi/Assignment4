package com.assignment4.Question1;


public class Employee extends Person{

    private int empID;
    private double salary;
    private final Responsibility job;

    public Employee(int id, String fName, String lName, String IDNumber, double salary, String position, String promotionDate, double bonus) {
        super(fName, lName, IDNumber);
        job = new Responsibility(position, promotionDate, bonus);
        setSalary(salary);
        setEmpID(id);
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setSalary(double newSalary) {
        if (salary >= 0.00) {
            this.salary = newSalary;
        }
    }

    public int getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return ("Employee Details: \nFirst Name: \t" + getFName() + "\nLast Name: \t\t" + getLName() + "\nID Number: \t\t" + getIDNumber());
    }

    public String getJobSpecs() {
        return "\nJob Description:\n********************\nPosition: \t\t\t" + job.getPosition() + "\nJob Promotion Date: \t" + job.getPromotionDate() + "\nBonus: \t\t\t\t"  + job.getBonus();
    }

}
