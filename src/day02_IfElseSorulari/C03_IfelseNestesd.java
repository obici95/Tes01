package day02_IfElseSorulari;

import java.util.Scanner;

public class C03_IfelseNestesd {
    public static void main(String[] args) {
        /*
        Kullanıcı Adı, Soyadı ve kredi kartı numaralarını sorarak özel forma dönüştürün.
        (Ad ve soyadının baş harfleri büyük olmalıdır)
        (Kredi kartı numarasını kontrol edin, 16 haneli degilse “Geçersiz kredi kartı numarası” yazısı
        degilse

        Giriş :

        John Beyaz 1234234534561478

        Çıktı :

        İsim : J*** W***

        CCN : **** **** **** 1478
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen CCN giriniz");
        String CCN = scan.nextLine();

        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");

        soyisim = soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");
        if (!(CCN.length() == 16 )) {
            System.out.println("gecersiz kredi kardi numarasi");
        } else {
            CCN=CCN.substring(0,12).replaceAll("\\d","*")
                    +CCN.substring(12);
            System.out.println("Giris :\nIsim :" + isim + "\n" + "Soyisim :" + soyisim + "\n" + "CCN :" + CCN);
        }

          /*
         Kullanıcı Adı, Soyadı ve kredi kartı numaralarını sorarak özel forma dönüştürün.
        (Ad ve soyadının baş harfleri büyük olmalıdır)
        (Kredi kartı numarasını kontrol edin,   16 haneli degilse “Geçersiz kredi kartı numarası” yazısı
        Giriş :
        John Beyaz 1234234534561478
        Çıktı :
        İsim : J*** W***
        CCN : **** **** **** 1478
         */
      // Scanner scan=new Scanner(System.in);
      // System.out.println("Lutfen isminizi giriniz");
      // String isim = scan.nextLine().toLowerCase();
      // System.out.println("lutfen soyisminizi giriniz");
      // String soyisim=scan.nextLine().toLowerCase();
      // System.out.println("Lutfen kredi kart no giriniz");
      // String kkNo= scan.nextLine();

      // isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
      // soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
      // kkNo=kkNo.replaceAll("\\D", "");
      // if (kkNo.length()!=16) {
      //     System.out.println("Geçersiz kredi kartı numarası");
      // }else {
      //     System.out.println("isim : "+ isim+
      //             " "+ soyisim +
      //             "\n"+ "**** **** **** "+ kkNo.substring(kkNo.length()-4));
      // }


    }
}
