package PratikHarmonic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        double harmonic = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hesaplanmasını istediğiniz sayıyı giriniz: ");
        sayi = input.nextInt();
        for (double i = 1; i <= sayi; i++){
            harmonic += (1 / i);
        }
        System.out.print(sayi + " sayısının harmonik serisi" + harmonic);
    }
}
