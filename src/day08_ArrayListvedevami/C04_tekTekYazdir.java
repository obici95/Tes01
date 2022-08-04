package day08_ArrayListvedevami;

import java.util.ArrayList;

public class C04_tekTekYazdir {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

        Array elemanları:  siyah,sari,mavi,turuncu

        ```
        Beklenen Çıktı:
        ```

        ```
        siyah
        ```

        ```
        sari
        ```

        ```
        mavi
        ```

        ```
        turuncu
        ```
         */

        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("siyah");
        arr1.add("sari");
        arr1.add("mavi");
        arr1.add("turuncu");

        System.out.println(arr1);



        for (int i = 0; i <= arr1.size()-1 ; i++) {

            System.out.println(arr1.get(i));
            System.out.println();
        }


    }
}
