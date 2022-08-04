package day02_IfElseSorulari;

public class C05_swapInterview {
    public static void main(String[] args) {
        /* Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
        int a= 3;
        int b= 5;
        Ornek Cikti:
        a=5
        b=3
        */
        int a= 3;
        int b= 5;

        b=a+b; // 8
        a=b-a; // 8-3=5
        b=b-a; //

        System.out.println(a);
        System.out.println(b);

        b=a+b;
        a=b-a;
        b=b-a;


    }
}
