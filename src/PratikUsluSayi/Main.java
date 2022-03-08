package PratikUsluSayi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,t, total = 1;

        System.out.print("Üssü alınacak sayıyı yazınız: ");
        k = input.nextInt();
        System.out.print("Üs olacak sayıyı yazınız: ");
        t = input.nextInt();

        for (int i = 1; i <= t; i++){
            total *= k;
        }
        System.out.print("Sonuç= " + total);

    }
}
