package KullaniciGiris;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullaniciAdi ="Mert", password = "123Mert", userName, userPassw, newPassword;
        byte choise;

        System.out.print("Giriş yapmak için lütfen kullanıcı adı girin :");
        userName = scan.next();
        System.out.print("Lütfen şifrenizi girin :");
        userPassw = scan.next();

        if(userName.equals(kullaniciAdi) && userPassw.equals(password)){
            System.out.println("Kullanıcı Adı ve Şifreniz Doğru! Başarılı Giriş Yaptınız!");
        }else if(userName.equals(kullaniciAdi) && !userPassw.equals(password)) {
            System.out.println("Girdiğiniz şifre yanlış!");
            System.out.println("Şifre yenilemek için cevabınız EVET ise 1, HAYIR ise 2 yazınız.");
            System.out.print("Şifre yenilemek ister misiniz? :");
            choise = scan.nextByte();
            if(choise ==1 || choise == 2 ){
                switch (choise) {
                    case 1 -> {
                        System.out.print("Yeni bir şifre giriniz: ");
                        newPassword = scan.next();
                        if (newPassword.equals(password)) {
                            System.out.print("Şifreniz eski şifreniz ile aynı o yüzden yeni bir şifre giriniz!");
                        } else {
                            System.out.print("Şifreniz başarılı bir şekilde değiştirildi, yeni şifre ile giriş yapıldı!");
                        }
                    }
                    case 2 -> System.out.print("Sistemden çıkış yapıldı.");
                }
            }else{
                System.out.print("Hatalı bir seçim yaptınız!");
            }
        }else{
            System.out.println("Hatalı Giriş!");
        }
    }
}
