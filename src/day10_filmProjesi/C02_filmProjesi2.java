package day10_filmProjesi;

import java.util.Scanner;

public class C02_filmProjesi2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hosgeldiniz lutfen 0 ile 2  arasinda (2 dahil) film numarasi girin ");
        int filmNo= scan.nextInt();

        String [] arr={"Inception","Matrix","Avangers"};

        if (filmNo==0) {
            secilenFilm1(arr[0]);

        }
        if (filmNo==3) {


        }
        if (filmNo==2){


        }

    }

    private static void secilenFilm1(String arr) {
        Scanner scan=new Scanner(System.in);
        String filmIsmi;
        int sayac=arr.length()*2;
        while (true){
            System.out.println("Sectiginiz filmin harf sayisi :"+ arr.length());
            System.out.println("sectiginiz filmi tahmin ediniz. "+"Tahmin hakkiniz :"+sayac);
            filmIsmi=scan.next();
            if (filmIsmi.equalsIgnoreCase(arr)){
                System.out.println("tebrikler filmi dogru tahmin ettiniz");
                break;
            }else {
                sayac--;
            } if (sayac==0){
                System.out.println("Kaybettiniz filmin adi :"+arr);
                break;
            }
        }

    }
}
