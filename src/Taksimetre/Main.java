package Taksimetre;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Taksimetre KM başına 2.20 TL tutmaktadır. - kmPrice
        // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        // Taksimetre açılış ücreti 10 TL'dir.
        // Kullanıcıdan km değeri alın.

        int tbaslangic = 10, kmMesafe;
        double kmPrice, tutar, toplam;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen gitmek istediğiniz mesafeyi giriniz =");
        kmMesafe = inp.nextInt();
        kmPrice = kmMesafe * 2.20 ;
        tutar =  tbaslangic + kmPrice;
        toplam = (tutar < 20) ? 20 : tutar;
        System.out.println("Ödenecek toplam ücret = " +toplam + "₺");
    }
}
