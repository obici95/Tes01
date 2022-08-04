package day07_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_arrayListeCevirme {
    public static void main(String[] args) {
        /*
        4---
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        ```
        Beklenen Çıktı:
        ```

        ```
        [Python, JAVA, PHP, Perl, C#, C++]
```
         */

        String [] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> yeniList=new ArrayList<>();

        for (int i = 0; i <=arr.length-1 ; i++) {
            yeniList.add(arr[i]);
        }
        System.out.println(yeniList);




        String [] kelime = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> kelimelist= new ArrayList<>(); // [Python, JAVA, PHP, Perl, C#, C++]

        for (String each : kelime) {
            kelimelist.add(each);

        }
        System.out.println("kelimelist = " + kelimelist); // [Python, JAVA, PHP, Perl, C#, C++]

        //---------------------------------
        /*
        2- Arrays.asList() kullanabiliriz.
                Ancak bu method'un 2 tane kötü yan etkileri var
                - Arrays class'ı  kullanıldığı için array özellikleri geçerli olur.
                  dolayısıyla list'te olan add, remove gibi size'i değiştiren method'lar bu şekilde oluşturulan
                  list'lerde kullanılmaz
          kaynak olan array ile ürün olan list özdeşleştirilir
          birinde yapılan değişiklik, otomatik olarak diğerine de işlenir.
         */


        List<String> kelimelist1 = Arrays.asList(kelime);
        System.out.println("kelimelist1 = " + kelimelist1); // [Python, JAVA, PHP, Perl, C#, C++]


    }
}
