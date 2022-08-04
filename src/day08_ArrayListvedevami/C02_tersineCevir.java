package day08_ArrayListvedevami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_tersineCevir {
    public static void main(String[] args) {
        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        ```
        Test Data:
        ```

        ```
        sentence -> "Java is fun"
        ```

        ```
        reversed **-> "**fun is Java**"**
         */

        String str2="java is fun";
        String []  arr=str2.split(" ");
        System.out.println(Arrays.toString(arr));

      List<String> list1=new ArrayList<>();


      String reverseeee="";
      for (String s : arr) {

           list1.add(s);
       }


        for (int i = list1.size()-1; i >=0 ; i--) {
            reverseeee+= list1.get(i) +" ";
        }
        System.out.println(reverseeee);


        //2. cozum
        String str="Java is fun";
        String[] str1=str.split(" ");

        System.out.println(Arrays.toString(str1));// [Java, is, fun]
        String reversed="";

        for (int i = str1.length-1; i >=0; i--) {
            reversed+=str1[i]+" ";
        }
        System.out.println(reversed);

















    }
}
