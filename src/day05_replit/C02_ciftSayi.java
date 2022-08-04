package day05_replit;

public class C02_ciftSayi {
    public static void main(String[] args) {
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

        OUTPUT  :
        100 98 96 94 92 … … … … 2 0
         */

        int sayi=100;
        while (sayi>=0){

            if (sayi%2==0){
                System.out.print(sayi+" ");
            }

         sayi-=2;
        }


        System.out.println();

        for (int i = 100; i >=0 ; i-=2) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }


    }
}
