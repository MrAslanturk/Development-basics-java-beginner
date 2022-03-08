package Ortalama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan verileri al
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("MTürkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat+ fizik + kimya + turkce + tarih + muzik);
        double ort = toplam / 6.0;
        System.out.println("Ortalamanız ="+ort);
        String durum = (ort < 60) ? "Üzgünüz, kaldınız :(" : "Tebrikler geçtiniz!";
        System.out.println(durum);
    }
}
