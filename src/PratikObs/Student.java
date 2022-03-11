package PratikObs;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
                this.c1.note = (double) note1 * 0.80;
        }
        if(note2 >= 0 && note2 <= 100){
                this.c2.note = (double) note2 * 0.80;
        }
        if(note3 >= 0 && note3 <= 100){
                this.c3.note = (double) note3 * 0.80;
        }
    }

    void opinionNote( int opNote1,int opNote2,int opNote3){
            if(opNote1 >= 0 && opNote1 <= 100) {
                this.c1.opNote =  (double) opNote1 * 0.60;
            }
            if(opNote2 >= 0 && opNote2 <= 100) {
                this.c2.opNote = (double) opNote2 * 0.60;
            }

            if(opNote3 >= 0 && opNote3 <= 100) {
                this.c3.opNote = (double) opNote3 * 0.60;
            }

    }

    void isPass(){
       this.avarage = ((this.c1.note + this.c1.opNote) + (this.c2.note + this.c2.opNote) + (this.c3.note + this.c3.opNote)) / 3;
        if(this.avarage > 55){
            System.out.println("*******************");

            System.out.println("Hababam sınıfı uyanıyor");
            this.isPass = true;
        }else{
            System.out.println("Hababam sınıfı kaldı!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Note: " + this.c1.note);
        System.out.println(this.c2.name + " Note: " + this.c2.note);
        System.out.println(this.c3.name + " Note: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
