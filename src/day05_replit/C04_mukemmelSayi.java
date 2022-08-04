package day05_replit;

import java.util.Scanner;

public class C04_mukemmelSayi {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

        * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.


        Input :

        6

        Output:

        6 Mukemmel Sayidir.

        ======================

        Input

        7

        Output:

        7 Mukemmel Sayidir degildir.

         */


        Scanner scan=new Scanner(System.in);

        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();;

        int toplam=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam==sayi){
            System.out.println(sayi+" Mukemmel bir sayidir");
        }else {
            System.out.println(sayi+" Mukemmel bir sayi degildir.");
        }


    }
}
