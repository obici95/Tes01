package day07_arrayList;

public class C01_gridSekli {
    public static void main(String[] args) {
        /*
        1---
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

```
        Beklenen Çıktı:
        ```

        ```
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         0  0  0  0  0  0  0  0  0  0
         */

        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.print("0  ");
            }
            System.out.println();
        }

    }
}
