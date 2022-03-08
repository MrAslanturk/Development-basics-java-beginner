package PratikFourFivePower;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;

        System.out.print("Bir sayı giriniz: ");
        numb = input.nextInt();
        for (int i = 1; i < numb; i *=4){
            System.out.println("4\'ün kuvveti Sayılar: " + i );
        }
        for(int j = 1; j < numb; j *= 5){
            System.out.println("5\'in kuvveti Sayılar: " + j );
        }

    }
}
