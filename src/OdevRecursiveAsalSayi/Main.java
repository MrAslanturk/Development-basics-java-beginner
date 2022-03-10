package OdevRecursiveAsalSayi;
import java.util.Scanner;

public class Main {
    static boolean isPrime(int number){
        boolean result = false;
        for(int i = 1; i < number; i++){
            result = true;
            if(number % i == 0){
                result = false;
            }else{
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();
        if(isPrime(n) == false){
            System.out.print(n + " asal değil");
        }else{
            System.out.print(n + " asaldır");
        }
    }
}
