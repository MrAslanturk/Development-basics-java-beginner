package Hipotenus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan üçgenin kenar uzunluklaırnı al
        int a,b,c,cevre;
        double u,alan,sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen 1. kenar uzunluğunu giriniz = ");
        a = inp.nextInt();
        System.out.print("Lütfen 2. kenar uzunluğunu giriniz = ");
        b = inp.nextInt();
        System.out.print("Lütfen 3. kenar uzunluğunu giriniz = ");
        c = inp.nextInt();
        cevre = a+b+c;
        System.out.println("Üçgenin çevresi : " + cevre);

        u = cevre / 2;
        alan = u*(u-a)*(u-b)*(u-c);
        sonuc= Math.sqrt(alan);
        System.out.println("Üçgenin alanı : " + sonuc);

    }
}
