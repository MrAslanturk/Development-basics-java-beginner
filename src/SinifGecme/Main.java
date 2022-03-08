package SinifGecme;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik, toplam =0;

        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan verileri al
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("MTürkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int [] notlar = {mat, fizik , kimya , turkce , tarih , muzik};
        for(int i = 0; i < notlar.length; i++){
           //
            if((0 <= notlar[i]) && (notlar[i] <= 100)){
              toplam  += notlar[i];
                System.out.println("Ortalamaya katılan notlar " + i + ":" + notlar[i]);
            }else{
                System.out.print(notlar[i] + " 0-100 aralaığında olmadığı için ortalamaya eklenmemiştir!");
            }
        }
        double ort = toplam / 6.0;
        System.out.println("Ortalamanız ="+ort);
        String durum = (ort < 60) ? "Üzgünüz, kaldınız :(" : "Tebrikler geçtiniz!";
        System.out.println(durum);

    }
}
