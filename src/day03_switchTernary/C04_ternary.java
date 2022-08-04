package day03_switchTernary;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.

        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

        Eger aynı karakterlere sahipse

        "isim ayni karakterlere sahiptir." yazdirin.

        Eger ayni kaakterlere sahip degilse

        "Dizenin benzersiz karakterleri var" yazdirin.

        Ternary kullanin.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=scan.next();

        char harf=isim.charAt(0);
        char harf1=isim.charAt(1);
        char harf2=isim.charAt(2);

        System.out.println(!(isim.length() == 3) ? "isim 3 karakter olacaktir " : (harf==harf1)? "isim ayni karakterlere sahiptir" : (harf==harf2) ? "isim ayni karakterlere sahiptir" :
                (harf1==harf2) ? "isim ayni karakterlere sahiptir" : "Dizenin benzersiz karakterleri var"  );


       //!(isim.length() == 3)  ? "lutfen gecerli bir karakter giriniz" :  (isim.charAt(0) == isim.charAt(1) || isim.charAt(0)== isim.charAt(2) || isim.charAt(1) == isim.charAt(2))
       //        ? "isim ayni karakterlere sahiptir. " : "isim ayni karakterlere sahip degil"  ;







    }
}
