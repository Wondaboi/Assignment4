package com.assignment4.DIP;

class BTeacher{
    public void Teaches(){
        System.out.println("The Teacher teaches enlgish well");
    }
}
class BTeacherAssistant{
    public void Teaches(){
        System.out.println("The Teacher Assistant teaches enlgish badly");
    }
}

class BPrincipal{
    BTeacher Teacher;
    BTeacherAssistant TeacherAssistant;

    public void setEmp1(BTeacher Teacher) {
        this.Teacher = Teacher;
    }
    public void setEmp2(BTeacherAssistant TeacherAssistant) {
        this.TeacherAssistant = TeacherAssistant;
    }

    public BTeacher getEmp1() {
        return Teacher;
    }
    public BTeacherAssistant getEmp2() {
        return TeacherAssistant;
    }


    public void teach(){
        Teacher.Teaches();
        TeacherAssistant.Teaches();

    }

}
