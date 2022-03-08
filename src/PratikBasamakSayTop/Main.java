package PratikBasamakSayTop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b, numberTotal = 0;
        System.out.print("Lütfen bir sayı giriniz: ");
        a = input.nextInt();
        if(a > 9) {
            while (a != 0) {
                b = a % 10;
                a /= 10;
                numberTotal += b;
            }
        }else{
            System.out.println("Hatalı giriş! En az iki basamaklı ve pozitif tam sayı giriniz!");
            System.exit(0);
        }
        System.out.print(a + " sayısının basamakları toplamı = " + numberTotal);

    }
}
