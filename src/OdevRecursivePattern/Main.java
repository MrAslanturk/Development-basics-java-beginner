package OdevRecursivePattern;
import java.util.Scanner;

public class Main {
    /*
    * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    * Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    * Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    * Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
    * */
    static int pattern(int number){
        int tempNumb = number;
        while(number > 0){
            number -= 5;
            System.out.println(number);
            if(number == 0 || number < 0){
                for(int i = number; i <= tempNumb;){
                    i += 5;
                    if(i +5 == tempNumb){
                        break;
                    }
                    System.out.println(i);
                }

            }
        }
        return tempNumb;
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        n = input.nextInt();
        System.out.print(pattern(n));
    }
}
