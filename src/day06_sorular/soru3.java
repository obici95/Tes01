package day06_sorular;

import java.util.Arrays;

public class soru3 {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

            not: Test datadaki değerleri kullanınız.

            ```
            Test Data:
            ```

            ```
            [1232, 1134,2345,1022]
            ```

            ```
            [Java, Python, PHP, C#, C Programming, C++]
            ```

            ```
            Beklenen Çıktı:
            ```

            ```
            [1022,1134,1232,2345]
            ```

            ```
            [C Programming, C#, C++, Java, PHP, Python]
         */

        int[] arr1= {1232,1134,2345,1022};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2={"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
