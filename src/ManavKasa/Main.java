package ManavKasa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Armut : 2,14 TL  * 0 kg
        // Elma : 3,67 TL * 1 kg
        // Domates : 1,11 TL * 1 kg
        // Muz: 0,95 TL * 2kg
        // Patlıcan : 5,00 TL * 3 kg

        double  armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;
        toplam = (armut *0) + (elma * 1) + (domates * 1 ) + (muz * 2) + (patlican *3);
        System.out.println("Ödenmesi gereken toplam tutar :" + toplam + "₺");
    }
}
