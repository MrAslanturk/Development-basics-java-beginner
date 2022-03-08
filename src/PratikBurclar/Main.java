package PratikBurclar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int month, day;

        System.out.print("Lütfen Doğum tarihinize ait ayı giriniz : ");
        month = scn.nextInt();

        System.out.print("Lütfen Doğum tarihinize ait günü giriniz : ");
        day = scn.nextInt();

        String koc = "Koç Burcu : 21 Mart - 20 Nisan";
        String boga = "Boğa Burcu : 21 Nisan - 20 Mayıs";
        String ikizler = "İkizler Burcu : 21 Mayıs - 21 Haziran";
        String yengec = "Yengeç Burcu : 22 Haziran - 22 Temmuz";
        String aslan = "Aslan Burcu : 23 Temmuz - 22 Ağustos";
        String basak = "Başak Burcu : 23 Ağustos - 22 Eylül";
        String terazi = "Terazi Burcu : 23 Eylül - 23 Ekim";
        String akrep = "Akrep Burcu : 24 Ekim - 22 Kasım";
        String yay = "Yay Burcu : 23 Kasım - 21 Aralık";
        String oglak = "Oğlak Burcu : 22 Aralık - 20 Ocak";
        String kova = "Kova Burcu : 21 Ocak - 18 Şubat";
        String balik = "Balık Burcu : 19 Şubat - 20 Mart"; //

        if(month == 3){
            if(day >= 21){
                System.out.println(koc);
            }else{
                System.out.println(balik);
            }
        }
        if(month == 4){
            if(day <= 20){
                System.out.println(koc);
            }else{
                System.out.println(boga);
            }
        }
        if(month == 5){
            if(day <= 20){
                System.out.println(boga);
            }else{
                System.out.println(ikizler);
            }
        }
        if(month == 6){
            if(day <=21){
                System.out.println(ikizler);
            }else{
                System.out.println(yengec);
            }
        }
        if(month == 7){
            if(day <=22){
                System.out.println(yengec);
            }else{
                System.out.println(aslan);
            }
        }
        if(month == 8){
            if(day <= 22){
                System.out.println(aslan);
            }else{
                System.out.println(basak);
            }
        }
        if(month == 9){
            if(day <= 22){
                System.out.println(basak);
            }else{
                System.out.println(terazi);
            }
        }
        if(month == 10){
            if(day <= 23){
                System.out.println(terazi);
            }else{
                System.out.println(akrep);
            }
        }
        if(month == 11){
            if(day <= 22){
                System.out.println(akrep);
            }else{
                System.out.println(yay);
            }
        }
        if(month == 12){
            if(day <= 21){
                System.out.println(yay);
            }else{
                System.out.println(oglak);
            }
        }
        if(month == 1){
            if(day <= 20){
                System.out.println(oglak);
            }else{
                System.out.println(kova);
            }
        }
        if(month == 2){
            if(day <= 18){
                System.out.println(kova);
            }else{
                System.out.println(balik);
            }
        }

    }
}
