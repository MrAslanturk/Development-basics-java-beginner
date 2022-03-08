package PratikYildizUcgen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int spot;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Deger Giriniz: ");
        spot = input.nextInt();

        for (int i = 1; i <= spot; i++) {
            for (int k = 1; k <= (spot - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int a = 1; a < spot; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (spot - a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
