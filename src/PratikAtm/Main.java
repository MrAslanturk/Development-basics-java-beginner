package PratikAtm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
       // int select; -- do while ;
        byte choise = 0;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("Mert") && password.equals("Mert123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("Lütfen yapmak istediğiniz işlemi belirtin:\n" +
                        "1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");

                choise = input.nextByte();
                switch (choise){
                    case 1:
                        System.out.println("Para miktarı: ");
                        price = input.nextInt();
                        balance += price;
                    break;
                    case 2:
                        System.out.println("Para miktarı: ");
                        price = input.nextInt();
                        if(price > balance){
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                    break;
                    default:
                        throw new IllegalStateException("Hatalı seçim: " + choise);
                }
               /* do-while örnek
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

                */
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}