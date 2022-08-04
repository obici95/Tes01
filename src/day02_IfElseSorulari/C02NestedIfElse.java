package day02_IfElseSorulari;

import java.util.Scanner;

public class C02NestedIfElse {
    public static void main(String[] args) {
        /*
        Nested iF kullanarak asagidaki soruyu cozen kodu yaziniz

        Kullanicidan bir sifre girmesini isteyin

        Eger ilk harf buyuk ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli sifre",
        degilse "Gecersiz sifre yazdirin.

        Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli sifre",
        degilse "Gecersiz sifre yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifreyi giriniz");
        String girilenSifre=scan.nextLine();
        char ilkHarf=girilenSifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        } else if (ilkHarf>='a' && ilkHarf<='z') {
            if (ilkHarf=='z'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }

        }
    }
}
