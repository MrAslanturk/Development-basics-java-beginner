package OdevMukemmelSayi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                System.out.println(n + "sayısının pozitif tam sayı bölenleri");
                System.out.println(i);
                total += i;
            }
        }
        if(total == n){
            System.out.print(n +" sayısı bir mükemmel sayıdır");
        }else{
            System.out.print(n +" sayısı bir mükemmel sayı değildir!");
        }

    }
}
