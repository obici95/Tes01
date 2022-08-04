package day07_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ikinciBuyhukBUlma {
    public static void main(String[] args) {
         /*
        5----
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

        Array: [1232,2345,5467,678,3454,2312,3451]
         */

        int[] arr = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr);


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println();

        int enBuyukSayi = 0;
        int ikinciSayi = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > enBuyukSayi) {
                enBuyukSayi = list.get(i);
            }

        }

        System.out.println(enBuyukSayi);

        for (int i = 0; i < list.size()-2; i++) {
            if (list.get(i) > ikinciSayi ) {
                ikinciSayi = list.get(i);
            }

        }
        System.out.println(ikinciSayi);





        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [678, 1232, 2312, 2345, 3451, 3454, 5467]
        System.out.println(arr.length); // 7

        System.out.println("arr nin 2. en buyuk sayisi = " + (arr[arr.length-2]));


    }

}
