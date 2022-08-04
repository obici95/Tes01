package day06_sorular;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


        Input  :1238

        Output :Girilen Numananin Tersi: 8321
         */



        //1.Çözüm
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();

        String str=String.valueOf(sayi);
        String []str1= str.split("");

        String reverse="";

        for (int i = 0; i < str1.length; i++) {

            reverse+=str1[i];
        }
        System.out.println(reverse);

        //2.Çözüm
     //  Scanner scan=new Scanner(System.in);
     //  System.out.println("Bir sayi giriniz");
     //  int sayi= scan.nextInt();

     //  String str=String.valueOf(sayi);

     //  StringBuilder tersSayi=new StringBuilder(str);
     //  System.out.println(tersSayi.reverse());

    }
}
