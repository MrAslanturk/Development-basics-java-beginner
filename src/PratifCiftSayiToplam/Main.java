package PratifCiftSayiToplam;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Variables*/
        int number, total = 0, average = 0, counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        if(number <= 0 ){
            System.out.print("Lütfen geçerli bir sayı giriniz!");
            System.exit(0);
        }
        for(int i = 0; i <= number; i++){
             if(i > 0)
            {
                if(i % 3 == 0 && i % 4 == 0){
                    total += i;
                    counter+=1;
                }
            }
        }
        average = (total / counter);
        System.out.println("Sonuç: " + average);

    }
}
