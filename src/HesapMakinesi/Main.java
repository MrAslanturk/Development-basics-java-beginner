package HesapMakinesi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numb1, numb2;
        byte choise;
        System.out.print("İşlem yapmak için bir değer giriniz =");
        numb1 = scan.nextInt();
        System.out.print("İşlem yapmak için ikinci bir değer giriniz =");
        numb2 = scan.nextInt();

        System.out.println("İşlem numaraları: 1 - Toplama \t 2 - Çıkarma \t 3 - Çarpma \t 4 - Bölme");
        System.out.print("Yapmak istediğiniz işlemin numarasını giriniz : ");
        choise = scan.nextByte();
        if(choise >= 1 && choise <=4) {
            switch (choise) {
                case 1:
                    System.out.println("Toplama işleminizin sonucu = "+ (numb1 + numb2));
                break;
                case 2:
                    System.out.println("Çıkarma işleminizin sonucu = "+ (numb1 - numb2));
                    break;
                case 3:
                    System.out.println("Çarpma işleminizin sonucu = "+(numb1 * numb2));
                    break;
                case 4:
                    System.out.println("Bölme işleminizin sonucu = "+(numb1 / numb2));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choise);
            }
        }else{
            System.out.println("Lütfen, geçerli bir değer giriniz!");
        }
    }
}
