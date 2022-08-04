package day07_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class C02_degerArama {
    public static <Aranan, Beklenen> void main(String[] args) {
        /*
        2---
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]

        ```
        Aranan Değer:2020
        ```

        ```
        Beklenen Çıktı:**True**
        ```

        ```
        Aranan Değer:2010
        ```

        ```
        Beklenen Çıktı :**False**
```
         */

        int[] arr= {1551,1223,1443,1267,1789,1023,2020};

      int [] arananDeğer={2020};
       Arrays.sort(arr);

      System.out.println(Arrays.toString(arr));

         /*
        System.out.println();
         for (int i = 0; i <arr.length ; i++) {
          if (arr[i]==arananDeğer[0]) {
              System.out.println("**True**");

          }else {
              System.out.println("false");}

      }

      System.out.println(Arrays.binarySearch(arr, 2020));
        */

/*

         /*
        int deger =Arrays.binarySearch(arr,2020);


        if(deger<0)
            System.out.println("**False**");
        else
            System.out.println("**True**");
        */




        int arr2 [] = {1551,1223,1443,1267,1789,1023,2020};
        int sayi1 = 2020;
        int sayi2 = 2010;

        Arrays.sort(arr2);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2)); // [1023, 1223, 1267, 1443, 1551, 1789, 2020]
        System.out.println(Arrays.binarySearch(arr, sayi1)); // 6

        List<Integer> sayilar = new ArrayList<Integer>();

        for (Integer each: arr2) {
            sayilar.add(each);
        }
        System.out.println("sayilar = " + sayilar);  // [1023, 1223, 1267, 1443, 1551, 1789, 2020]

        System.out.println(sayilar.contains(sayi1)); // true,
        System.out.println(sayilar.contains(sayi2)); // false





     //   int arr[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
     //   int sayi1 = 2020;
     //   int sayi2 = 2010;

        boolean sonuc = contain(arr, sayi2);
        System.out.println(sonuc);

    }

    public static boolean contain(int[] arr, int sayi) {
        boolean sonuc = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (sayi)) {

                sonuc = true;
            }
        }
        return sonuc;


    }
}
