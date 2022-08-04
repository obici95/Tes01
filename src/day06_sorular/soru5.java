package day06_sorular;

public class soru5 {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

            Array =  [20, 30, 25, 35, -16, 60, -100 ]

            ```
            Beklenen Çıktı:
            ```

            ```
            Array Sayılarının ortalaması: 7.0
         */

       int [] arr3= {20, 30, 25, 35, -16, 60, -100};

       int toplam=0;
       int ort=0;

        for (int i = 0; i <arr3.length ; i++) {
            toplam+=arr3[i];
            ort=toplam/arr3.length;
        }
        System.out.println(ort);

    }
}
