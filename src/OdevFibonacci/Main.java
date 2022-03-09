package OdevFibonacci;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,n1 = 0,n2 = 1,n3,result;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen oluşturulacak dizinin eleman sayısını giriniz: ");
        n = input.nextInt();
        for(int i = 2; i < n; ++i){
            n3 = n2 + n1;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
