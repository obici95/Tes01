package day05_replit;

public class C03_Alfabe {
    public static void main(String[] args) {
        /*
        Konsolda Alfabeyi Yazdıran programi yaziniz.

            OUTPUT  :

            a b c .. .. .. .. y z
         */

        char harf='a';

      for (int i = harf; i <='z' ; i++) { // i int oldugu icin sayilari yazdiriyor

          System.out.print(harf+ " ");
          harf++;

      }


        while (harf<='z'){
            System.out.print(harf+" ");
            harf++;
        }

        System.out.println();
        for (char i = 'a'; i <'z' ; i++) {
            System.out.print(i+" ");
        }




    }
}
