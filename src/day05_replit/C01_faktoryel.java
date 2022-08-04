package day05_replit;

public class C01_faktoryel {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

        Input : 6

        Output: 6!=6*5*4*3*2*1=720
         */

        int input=6;
        int output=1;

        for (int i = 1; i <=input ; i++) {
            output*=i;
        }
        System.out.println(output);
    }
}
