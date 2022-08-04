package day03_switchTernary;

public class C02_numaralrinToplami {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan
        ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam
        10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        Ornek:
        INPUT :
        25
        46
        OUTPUT :
        Numaralarin Toplami:
        71

         */


        String sayi="25";
        String sayi2="46";
       if ( sayi2.length()>10 || sayi.length()>10){
           System.out.println("OverFlow");
       }else {
         double sonuc=  Double.parseDouble(sayi)+Double.parseDouble(sayi2);
         int sonuc1= (int) sonuc;
           System.out.println("Numaralarin toplami :\n"+ sonuc1);
       }


    }
}
