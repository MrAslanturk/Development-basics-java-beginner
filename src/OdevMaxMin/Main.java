package OdevMaxMin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, min = 0, max = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 1; i <=n; i++){
            System.out.print(i + ". sayiyi giriniz: ");

            int x = input.nextInt();
            if(min == 0) min = x;
            if(max == 0) max = x;
            min = (min>x) ? x : min;
            max = (max < x) ? x : max;


        }
        System.out.println("Girmiş olduğunuz sayınların en küçük değeri= " + min);
        System.out.println("Girmiş olduğunuz sayınların en büyük değeri= " + max);

    }
}
