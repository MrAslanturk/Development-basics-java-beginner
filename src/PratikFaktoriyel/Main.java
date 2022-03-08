package PratikFaktoriyel;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int N, r, NtoR,totalN = 1, totalNtoR = 1, totalR = 1, result;

        System.out.print("Kümenin eleman sayısını giriniz: ");
        N = input.nextInt();
        System.out.print("Kümenin kombinasyon sayısını giriniz: ");
        r = input.nextInt();
        // (n-r)! = işlemi için totalNtoR
        NtoR = N-r;

        for (int i= N; i>0; i--){
            // N faktöriyel hesabı
            totalN = totalN * i;
        }

        for (int j = NtoR; j>0; j--) {
            // (n-r)! faktöriyel hesabı
            totalNtoR = totalNtoR * j;
        }

        for (int k = r; k > 0; k--){
            // r faktöriyel hesbaı
            totalR = totalR * k;
        }
        System.out.println(N + "! faktöriyel sonucu= "+totalN);
        System.out.println(NtoR + "! faktöriyel sonucu= "+ totalNtoR);
        System.out.println(r + "! faktöriyel sonucu= "+totalR);

        result = totalN / (totalNtoR * totalR);
        System.out.println(N + " sayısının " + r + " sayısı ile kombinasyonu\'nun sonucu = "+ result );
    }
}
