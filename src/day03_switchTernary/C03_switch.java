package day03_switchTernary;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        INPUT:

        Ay Numarasi:

        2

        Yil :

        2016

        OUTPUT  :

        Subat 2016 29 Gundur.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz");
        int ay= scan.nextInt();
        System.out.println("Lutfen bir yil giriniz");
        int yil= scan.nextInt();

        switch (ay){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println( "aralik");
                break;
            default:


        }
        if (ay==1 || ay==3 || ay== 5|| ay==7||ay==8||ay==10||ay==12){
            System.out.println(yil+" 31 gün");

        }else if (ay==4 || ay==6 || ay==9||ay==11){
            System.out.println(yil+" 30 gün");

        } else if (ay==2) {
            System.out.println(yil+" 28 gün");

        }

         /*
         Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

         INPUT:
         Ay Numarasi:   2
         Yil :           2016

         OUTPUT  :      Subat 2016 29 Gundur.

         */

       //  Scanner scan=new Scanner(System.in);
       //  System.out.println("Bir aydaki gün sayısını hesaplamak icin yıl giriniz");
       //  int yil= scan.nextInt();
//
       //  System.out.println("ay no giriniz");
       //  int ayNo= scan.nextInt();
//
//
       //  int gun=1; // requirement da istemedigi icin rastgele atadik
//
//
       //  LocalDate tarih=LocalDate.of(yil,ayNo,gun);
//
       //  System.out.println(yil + " yilinin " + ayNo + " numarali ayi " + tarih.lengthOfMonth() +" gundur");
    }
}
