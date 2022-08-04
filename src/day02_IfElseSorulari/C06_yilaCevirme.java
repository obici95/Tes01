package day02_IfElseSorulari;

import java.time.LocalDate;
import java.util.Scanner;

public class C06_yilaCevirme {
    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

        INPUT:

        Dakika sayısı: 3456789

        OUTPUT :

        3456789 dakika yaklaşık 6 yıl 210 gündür

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutffen dakika sayisini girin");
        int dakika= scan.nextInt();

        int gun=dakika/1440;
        int yil=gun/365;
        gun=gun%365;






        System.out.println( dakika + " dakika yaklasik  " +  yil + " yil "+ gun +" gundur" );


    }
}
