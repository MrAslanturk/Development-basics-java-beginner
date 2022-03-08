package CinZodyagi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bYear; // Birthday Year : bYear;
        int result; // bYear % 12;

        // Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        String maymun = "Çin Zodyağı Burcunuz: Maymun";
        String horoz = "Çin Zodyağı Burcunuz: Horoz";
        String kopek = "Çin Zodyağı Burcunuz: Köpek";
        String domuz = "Çin Zodyağı Burcunuz: Domuz";
        String fare = "Çin Zodyağı Burcunuz: Fare";
        String okuz = "Çin Zodyağı Burcunuz: Öküz";
        String kaplan = "Çin Zodyağı Burcunuz: Kaplan";
        String tavsan = "Çin Zodyağı Burcunuz: Tavşan";
        String ejderha = "Çin Zodyağı Burcunuz: Ejderha";
        String yilan = "Çin Zodyağı Burcunuz: Yılan";
        String at = "Çin Zodyağı Burcunuz: At";
        String keci = "Çin Zodyağı Burcunuz: Keçi";
        System.out.print("Doğum Yılınızı Giriniz: ");

        bYear = input.nextInt();
        result = (bYear % 12);
        if(result == 0){
            System.out.println(maymun);
        }else if(result == 1){
            System.out.println(horoz);
        }else if(result == 2){
            System.out.println(kopek);
        }else if(result == 3){
            System.out.println(domuz);
        }else if(result == 4){
            System.out.println(fare);
        }else if(result == 5){
            System.out.println(okuz);
        }else if(result == 6){
            System.out.println(kaplan);
        }else if(result == 7){
            System.out.println(tavsan);
        }else if(result == 8){
            System.out.println(ejderha);
        }else if(result == 9){
            System.out.println(yilan);
        }else if(result == 10){
            System.out.println(at);
        }else{
            System.out.println(keci);
        }
    }
}
