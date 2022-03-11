package PratikObs;

public class Course {
    /* Nitelikler */
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double opNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int opNote = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
