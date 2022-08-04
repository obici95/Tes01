package day01_forLoopTeam8;

import java.util.Scanner;

public class C02_forLoop100uGecince {
    public static void main(String[] args) {
        /*
          Girilen sayilarin toplami 100'u  gecince, artik sayi istemesin
          ve o ana kadar kac sayi girildiyse toplamini yazdirsin
         */
        Scanner scan=new Scanner(System.in);
        int top=0;
        int sayac=1;
        int sayi=0;

        for (int i = 0 ;top<=100 ; i++) {
            System.out.println(sayac+". index'deki sayiyi giriniz");
             sayi=scan.nextInt();
            top+=sayi;
            sayac++;
        }
        System.out.println(sayac+ " adet sayi girdiniz\nbu sayilarin toplamlari :" +top);

    }
}
