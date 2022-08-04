package day02_IfElseSorulari;

import java.util.Scanner;

public class C06_saniyeProgrami {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.
        Örnek Çıktı:
        1 saat 10 dakika 50 saniye ==>
        4250 saniye
         */


        Scanner scan=new Scanner(System.in);


      int saniye=4250;
      int dakika=saniye/60;
      int saat=dakika/60;

      saniye=saniye%60;
      dakika=dakika%60;

        System.out.println(saat+" saat "+ dakika+" dakika "+ saniye + " saniye");






    }
}
