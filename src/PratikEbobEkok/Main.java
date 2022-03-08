package PratikEbobEkok;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2, ebob = 1, ekok, k = 0;

        System.out.print("Lütfen n1 sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("Lütfen n2 sayısını giriniz: ");
        n2 = input.nextInt();

        // ebob için iki sayının küçük sayıyı alıp o sayının bölenlerini bulup, bu bölenlerin
        // aynı zamanda büyük olanı da kalansız bölüp bölmediğine bakacağız
        if(n1 < n2){
            k = n1;
        }else if(n2<n1){
            k = n2;
        }else{
            System.out.println("Lütfen birbirinden farklı değerler giriniz'");
        }
        System.out.println("------------------------------------");
        /* For Döngüsü ile çözüm
        */
        for(int i= 1; i <= k; i++ ){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }

        System.out.println("ebob: " + ebob);

        ekok = ((n1*n2)/ebob);
        System.out.println("ekok: " + ekok);

        System.out.println("--------------------------------------");
        /* While Döngüsü ile
        int t=1;
        while(t <= n1 || t <= n2){
            if(n1%t==0 && n2%t==0){
             ebob =t;
            }
            t++;
        }
        System.out.println("ebob: " + ebob);

       int t=1;
            while (t <= (n1*n2)){
                if (t % n1 == 0 && t % n2 == 0) {
                    System.out.println("ekok: "+t);
                    break;
                }
                t++;
            }

         */
    }
}
