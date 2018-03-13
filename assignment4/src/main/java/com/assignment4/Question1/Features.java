package com.assignment4.Question1;


public class Features {

    public static void polymorphism(){
        Person emp = new Employee(1,"Sam", "Nash", "9105465147024", 22000, "Teacher","2 years",  2500);
        System.out.println(emp.toString());
    }

    public static void inheritance(){
        Employee emp1 = new Employee(1,"Sam", "Nash", "9105465147024", 22000, "Teacher","2 years",  2500);
        Person emp2 = new Employee(2,"Sam", "Nash", "9105465147024", 22000, "Teacher","2 years",  2500);
    }

    public static void composition(){
        Employee emp1 = new Employee(3, "Brandon", "Paulse", "9205155047024", 15000, "Teacher Assistant", "2 years", 1500);
        System.out.println(emp1.toString());
        System.out.println(emp1.getJobSpecs());

        Employee emp2 = new Employee(4, "Susan", "Hey", "95051365047021", 10000, "Replacement Teacher", "6 Months", 1000);
        System.out.println(emp2.toString());
        System.out.println(emp2.getJobSpecs());
    }

    public static void encapsulation(){
        Employee emp = new Employee(1,"Sam", "Nash", "9105465147024", 22000, "Teacher","2 years",  2500);
        System.out.println(emp.toString());

        emp.setEmpID(10);
        emp.setFName("Gordon");
        emp.setLName("Rasay");
        emp.setIDNumber("910515035084");
        emp.setSalary(15000);

        System.out.println(emp.toString());
        System.out.println("ID: \t\t\t\t" + emp.getEmpID());
        System.out.println("Salary: \t\t" + emp.getSalary());

    }
}
