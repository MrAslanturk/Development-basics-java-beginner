package ArtikYil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userYear;
        System.out.print("Lütfen bir yıl giriniz.(örn. 1995): " );
        userYear = input.nextInt();
        if(userYear > 0){
            if((userYear % 4 == 0)){
            System.out.println(userYear + " bir artık yıldır!");
        }else{
            System.out.println(userYear + " artık bir yıl değil!");
            }
        }else{
            System.out.println("Hata! Lütfen geçerli bir yıl giriniz");
        }
    }
}
