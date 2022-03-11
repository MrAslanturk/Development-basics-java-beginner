package PratikObs;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "905101234567");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "905298765432");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "905235468512");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban" , "123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.opinionNote(95,85,75);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi" , "456", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(50,70,38);
        s2.opinionNote(90,80,60);
        s2.isPass();
    }
}
