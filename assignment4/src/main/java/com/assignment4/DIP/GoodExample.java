package com.assignment4.DIP;

interface Teach{
    public void Teaches();
}

class Teacher implements Teach{
    public void Teaches(){
        System.out.println("The Teacher teaches enlgish well");
    }
}

class TeachersAssistant implements Teach{
    public void Teaches(){
        System.out.println("The Teacher Assistant teaches enlgish badly");
    }
}

class Principal{
    Teach teach;

    public void setTeach(Teach teach) {
        this.teach = teach;
    }

    public void teach(){
        teach.Teaches();
    }

}
class Test{

    public static void main(String[]args)
    {
        Teach Teacher = new Teacher();
        Teach TeacherAssistant = new TeachersAssistant();

        Principal Boss = new Principal();
        Boss.setTeach(Teacher);
        Boss.teach();
        Boss.setTeach(TeacherAssistant);
        Boss.teach();
    }
}
