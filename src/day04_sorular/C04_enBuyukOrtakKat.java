package day04_sorular;

import java.util.Scanner;

public class C04_enBuyukOrtakKat {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

        Input :

        30

        40

            Beklenen Cikti:

        30 ve 40 icin GCD = 10

        30 ve 40 icin LCM = 120
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int ebob=0;
        int ekok=0;
        for (int i = 1; i <sayi1 ; i++) {
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println("ebob: " +ebob);
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("ekok : " + ekok);


    }
}
