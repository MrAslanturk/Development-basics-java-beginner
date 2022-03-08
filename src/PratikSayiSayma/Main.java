package PratikSayiSayma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c, gecici;
        // a,b,c değişkenleri sayilarin tam sayı kontrolü yapıldıktan sonra atanacağı değişkenler.
        // Girilen sayinin tam sayi olup olmadigini kontrol etmek icin
        // dSayi değişkeni oluşturdum, bir adet tekrar double ceviri değiskeni oluşturdum
        double dSayi1,dSayi2,dSayi3, tekrardSayi1,tekrardSayi2,tekrardSayi3;

        System.out.println("Lütfen bir tam sayı giriniz : ");
        dSayi1 = scn.nextDouble();
        System.out.println("Lütfen ikinci tam sayı giriniz : ");
        dSayi2 = scn.nextDouble();
        System.out.println("Lütfen üçüncü tam sayı giriniz : ");
        dSayi3 = scn.nextDouble();

        // dSayi değiskenindeki girilen degeri int a ya atıyorum
        a = (int)dSayi1;
        b = (int)dSayi2;
        c = (int)dSayi3;

        // Tekrar double a dönüştürüyorum.
        tekrardSayi1 = (double)a;
        tekrardSayi2 = (double)b;
        tekrardSayi3 = (double)c;

        // sayının tam sayı olup olmadığını ilk girilen sayi ile son tekrar dönüştürlen
        // sayinin birbirinden çıkartılması ile kalan 0 ise sayi tam sayi
        if(dSayi1 - tekrardSayi1 == 0 && dSayi2 - tekrardSayi2 == 0 && dSayi3 - tekrardSayi3 == 0){
            a = (int)tekrardSayi1;
            b = (int)tekrardSayi2;
            c = (int)tekrardSayi3;
            int [] dizi = {a,b,c};
            for(int i = 0; i < 2; i++){
                for(int j = i+1; j < 3; j++){
                    if(dizi[j] < dizi[i]){
                        gecici = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = gecici;
                    }
                }
            }
            for(int i = 0; i < 3 ; i++){
                System.out.println("Serinin " + (i+1) + ". elemanı : " + dizi[i]);
            }

        }else{
            System.out.println("Sayi tam sayi değildir :" + dSayi1);
            System.out.println("Sayi tam sayi değildir :" + dSayi2);
            System.out.println("Sayi tam sayi değildir :" + dSayi3);
        }


    }
}
