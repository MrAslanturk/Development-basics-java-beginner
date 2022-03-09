package OdevRecursivePower;
import java.util.Scanner;

public class Main {
    static int power(int a, int b){
        int result = 1;
        for(int i= 1; i <= b; i++){
            result *= a;
        }
        return result;

        /* Math pow Methodu ile çözüm
        *   int result;
        *   result = Math.pow(a,b);
        *   return result;
        * */
    }
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        x = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        y = input.nextInt();
        System.out.print(""+ power(x,y));
    }
}
