package com.assignment4.PLK;

class Dentist{
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
class Doctor{
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Name{

    private Dentist dentist = new Dentist();
    private Doctor doctor = new Doctor();

    public String getNames() {

        String Names = "";
        String DenName = "Dentist: " + dentist.getName();
        String DocName = "Doctor: " + doctor.getName();
        Names = DenName + DocName;
        return Names;
    }
}

