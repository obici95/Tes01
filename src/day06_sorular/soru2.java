package day06_sorular;

public class soru2 {
    public static void main(String[] args) {
        /*
            1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.


            OutPut:

            Sayilarin Toplami : 5050

         */

        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
    }
}
