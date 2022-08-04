package day04_sorular;

import java.util.Scanner;

public class C03_karakterTekrarlama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;

	    String name =“John came late"

		Expected Output:

        Number of a = 2

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String name =scan.nextLine();
        System.out.println("lutfen bir karakter girin");
        char ch1= scan.next().charAt(0);

        int sayac=0;

        for (int i = 0; i <name.length() ; i++) {

            if (ch1==name.charAt(i)){
                sayac++;
            }

        }
        System.out.println("Number of a =" + sayac);

        // ternary ile




        char harf=scan.next().charAt(0);
        int harfSay=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==harf) {
                harfSay++;
            }
        }
        System.out.println("Number of " + harf+ " = " + harfSay);





    }
}
