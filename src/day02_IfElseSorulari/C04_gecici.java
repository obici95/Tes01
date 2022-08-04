package day02_IfElseSorulari;

import java.util.Scanner;

public class C04_gecici {
    public static void main(String[] args) {
/*
        Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

        yanıt a ise,

        "Talebiniz işleniyor" mesajı yazdırılır

        yanıt b ise,

        "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
        yanıt c ise,

        "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

        başka herhangi bir yanıt değeri için,

        "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır

         */

        // Harf fazlaligi olmasin diye if yaptik

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf=scan.next();
        char ilkHarf=harf.charAt(0);

        if (harf.length()==1) {
            switch (ilkHarf) {
                case 'a':
                    System.out.println("Talebiniz işleniyor : "+ ilkHarf +" harfini girdiniz");
                    break;
                case 'b':
                    System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
                    break;
                case 'c':
                    System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
                    break;
                default:
                    System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
            }
        }else {
            System.out.println("lutfen tek harf giriniz");
        }

    }
}
