package OdevTersUcgen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();

        for (int a = 1; a < n; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (n - a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}