package day08_ArrayListvedevami;

import java.util.ArrayList;
import java.util.Collection;

public class C05_elemanEkleme {
    public static void main(String[] args) {
        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını ekleyen java kodunu yazınız.

        Array List:  siyah,mavi,kirmizi,beyaz

        en başa: **pembe**

        mavi-kirmizi arasına **yesil**  renk eklenecek.

        ```
        Beklenen Çıktı:
        ```

        ```
        [pembe,siyah,mavi,yesil,kirmizi,beyaz]
        ```
         */

        ArrayList<String> arr=new ArrayList<>();
        arr.add("siyah");
        arr.add("mavi");
        arr.add("kirmizi");
        arr.add("beyaz");
        System.out.println(arr);

        arr.add(0,"pembe");
        arr.add(3,"yesil");

        System.out.println(arr);





    }
}
