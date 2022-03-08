package PratikArmstrongNumb;

public class Main {
    public static int funcArmstrong(int k){
        int basNumber = 3;
        int tempNumber = k;
        int basValue;
        int result =0;
        int basPow;

        // while da sıfırlanan tempNumber değişkenine başlangıçta kullanıcıdan aldığımız number değerine tekrar atıyoruz
        while (tempNumber != 0) {
           basValue = tempNumber % 10;
         //   System.out.println("basamak değeri: "+ basValue);
        // System.out.println(basValue);
            // Üsüs İşlem */
           basPow = 1;
           for(int i = 1; i <= basNumber; i++){
                basPow *= basValue;
           }
            result += basPow;
           // System.out.println("sonuc: " + result);
           tempNumber /= 10 ;
        }
        if(result == k){
            System.out.println(k + " sayısı bir Armstrong sayıdır.");
        }
        // else{
        //    System.out.println(k + " sayısı bir Armstrong sayı değildir!");
        // }

        return k;
    }
    public static void main(String[] args) {

      //    /* Değişkenler */
      //   Scanner input = new Scanner(System.in);
      //   System.out.print("Lütfen bir sayı giriniz: ");
      //   int number = input.nextInt();
      //   int basNumber = 0; // Basamak Sayısı
      //   int tempNumber = number; // Geçici Sayi
      //   int basValue; // Basamak Değeri
      //   int result = 0;
      //   int basPow; // basamak Üssü

      //    while (tempNumber != 0) {
      //        tempNumber /= 10;
      //        basNumber++;
      //    }

      //    // while da sıfırlanan tempNumber değişkenine başlangıçta kullanıcıdan aldığımız number değerine tekrar atıyoruz
      //        tempNumber = number;
      //    while (tempNumber != 0) {
      //        basValue = tempNumber % 10;
      //        // System.out.println(basValue);

      //        // Üsüs İşlem */
      //        basPow = 1;
      //        for(int i = 1; i <= basNumber; i++){
      //            basPow *= basValue;
      //        }
      //        result += basPow;
      //        tempNumber /= 10 ;
      //    }
      //    if(result == number){
      //        System.out.println(number + " sayısı bir Armstrong sayıdır.");
      //    }else{
      //        System.out.println(number + " sayısı bir Armstrong sayı değildir!");
      //    }
      //    System.out.println(result);


        /* * * * * * * * * * * 3 Basamaklı Armstrong Sayılarını Bulma * * * * * * * * * * * * * \
        */
        for(int i = 100; i < 1000; i++){
            funcArmstrong(i);
        }

        /*
        int a = 2451, basamaksayi = 0, numberCounter =0;


        // ** Basamak Sayisi Bulma **
            // 2451 / 10 = 245
            // 245 / 10 = 24
            // 24 / 10 = 2
            // 2 / 10 = 0
            // 0 / 10 = 0


        System.out.println(a);
        while(a != 0){
            a /= 10;
            System.out.println(a);
            numberCounter++;
        }
        System.out.println("girilen sayinin basamak sayisi= " + numberCounter );


        // ** Bir Sayının Son Basamağını Bulma **
            // 2451 % 10 = 1; 2451 % 100; (yüzler basamağı son iki rkm)

        int b = 2451 ;
        int c = b % 10;

        // Üssü işlm

        int sub = 2, sup = 3;
        int result = 1;
        for(int i = 1; i <= sup; i++){
            result *= sub;
        }
        System.out.println(result);
         */

    }

}
