package PratikPalindrom;
import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        boolean result;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber) {
            result = true;
        }else{
            result = false;
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();
        boolean result;
        if((isPalindrom(number)) == true){
            System.out.print(number + " sayısı bir palindromik sayıdır");
        }else{
            System.out.print(number + " sayısı bir palindromik sayı değildir!");
        }
    }
}
