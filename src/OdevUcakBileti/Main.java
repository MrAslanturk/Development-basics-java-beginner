package OdevUcakBileti;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int wayDistance, customerAge;
        double  normalTotal, discountTotal,lastTotal, disAge, perDistance = 0.10, disChild = 0.50, disYoung = 0.10, disOld = 0.30, disRount = 0.20, excursionTicket;
        byte choise;

        // Discount abbreviation "dis" - İngilizce indirimin kısaltması olarak başlarında "dis"
        // excursionTicket - gidiş - Dönüş indirimli bilet, disRount gidiş dönüş seçim inidirm tutarı
        // normalTotal = wayDistance * perDistance;
        System.out.print("Lütfen gitmek istediğiniz mesafeyi km cinsinden yazınız : ");
        wayDistance = input.nextInt();
        if(wayDistance < 50){
            System.out.println("Lütfen pozitif ve 50 km\'den fazla bir değer giriniz!");
            System.exit(0);
        }
        System.out.print("Lütfen yaşınızı belirtin : ");
        customerAge = input.nextInt();
        if(customerAge < 0 && customerAge > 110){
            System.out.println("Lütfen geçerli bir yaş değeri giriniz!");
            System.exit(0);
        }
        System.out.println("Yolculuk için iki adet tip mevcuttur. 1 - Tek Yön | 2 - Gidiş-Dönüş");
        System.out.print("lütfen tercihiniz 1 veya 2 şeklinde belirtiniz. Seçiminiz : ");
        choise = input.nextByte();

        if(choise < 1 || choise > 2){
            System.out.println("Lütfen geçerli bir seçim yapınız!");
            System.exit(0);
        }else if(choise == 1){
            normalTotal = (wayDistance * perDistance);
            System.out.println("İndirimsiz uçak bileti fiyatı : " + normalTotal + "₺");
            if(customerAge < 12){
                disAge = (normalTotal * disChild);
                lastTotal = (normalTotal - disAge);
                System.out.println("Toplam Tutar = " + lastTotal + "₺");
            }else if(customerAge <= 24){
                disAge = (normalTotal * disYoung);
                lastTotal = (normalTotal - disAge);
                System.out.println("Toplam Tutar = "+ lastTotal + "₺");
            }else if(customerAge >= 65){
                disAge = (normalTotal * disOld);
                lastTotal = (normalTotal - disAge);
                System.out.println("Toplam Tutar = " + lastTotal + "₺");
            }else {
                System.out.println("Toplam Tutar = " + normalTotal + "₺");
            }
        }else {
            normalTotal = (wayDistance * perDistance);
            System.out.println("İndirimsiz uçak bileti fiyatı : " + normalTotal + "₺");
            if(customerAge < 12){
                disAge = (normalTotal * disChild);
                discountTotal = (normalTotal - disAge);
                excursionTicket = (discountTotal * disRount);
                lastTotal = (discountTotal - excursionTicket) * 2;
                System.out.println("Toplam Tutar = " + lastTotal + "₺");
            }else if(customerAge <= 24){
                disAge = (normalTotal * disYoung);
                discountTotal = (normalTotal - disAge);
                excursionTicket = (discountTotal * disRount);
                lastTotal = (discountTotal - excursionTicket) * 2;
                System.out.println("Toplam Tutar = " + lastTotal + "₺");
            }else if(customerAge >= 65){
                disAge = (normalTotal * disOld);
                discountTotal = (normalTotal - disAge);
                excursionTicket = (discountTotal * disRount);
                lastTotal = (discountTotal - excursionTicket) * 2;
                System.out.println("Toplam Tutar = " + lastTotal + "₺");
            }else {
                lastTotal = (normalTotal * disRount);
                System.out.println("Toplam Tutar = " + lastTotal + "₺");
            }
        }
    }
}
