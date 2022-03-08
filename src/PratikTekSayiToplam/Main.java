package PratikTekSayiToplam;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Değişkenler */
        int numb, total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Lütfen bir sayı giriniz:");
            numb = input.nextInt();
            if(numb % 4 == 0){
                total += numb;
            }
        }
        while(numb % 2 == 0);
        System.out.print("Toplam: " + total);
    }
}
