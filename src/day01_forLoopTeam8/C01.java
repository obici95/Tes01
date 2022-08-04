package day01_forLoopTeam8;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

 /*
    Ask user to their weight and height and type a program with calculates mass index
* HINT : Body Mass Index = Weight (kg) / Square of height (m)
Then give a message to user as following:
If BMI is less than 18.5 , you re weak
If BMI is between 18.5 and 25 , your weight is ideal
If BMI is between 25 and 30, you re fat
If BMI is more than or equal to 30, obese
     */
        Scanner sc=new Scanner(System.in);
        System.out.println(" lutfen vucut agırlıgınızı yazınız");
        double agirlik= sc.nextDouble();
        System.out.println("uzunlugunuzu m cinsinden giriniz");
        double uzunluk= sc.nextDouble();
        double vucutKitle=agirlik/(uzunluk*uzunluk);
        System.out.println(vucutKitle);
        if (vucutKitle<18.5){
            System.out.println("zayifsiniz");
        }
        if (vucutKitle>=18.5&&vucutKitle<25)
            System.out.println("kilo ideal");
        if (vucutKitle>=25&&vucutKitle<30)
            System.out.println("sisman");
        if (vucutKitle>=30)
            System.out.println("obez");

    }
}
