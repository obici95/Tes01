package day02_IfElseSorulari;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        // Kullanicidan gun ismini yazmasini isteyin.Girilen isim gecerli bir gun ise
        // gun isminin 1.2. ve3. harflerini buyuk diger isikini kucuk olarak yazdirin.
        // gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String alinanGunIsmi=scan.next();

        if (alinanGunIsmi.equals("Pazartesi") || alinanGunIsmi.equals("Sali") || alinanGunIsmi.equals("Carsamba") ||
                alinanGunIsmi.equals("Persembe") || alinanGunIsmi.equals("Cuma") || alinanGunIsmi.equals("Cumartesi") ||
                alinanGunIsmi.equals("Pazar") ){
            System.out.println(alinanGunIsmi.substring(0,3).toUpperCase()
                    +alinanGunIsmi.substring(3).toLowerCase());
        }else {
            System.out.println("Gecerli gun ismini giriniz");
        }
        
        System.out.println("Github'dan merhaba bir gun ismi giriniz");


    }
}
