package day04_sorular;

public class C05_yinelenenKarakter {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

        Input :

        String str=“Javaisalsoeasy”

        Output: a s

         */


        String str = "Javaisalsoeasy";
        String tekraredenler = "";
        String tekrarsiz = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    tekraredenler += str.substring(i, i + 1);
                }
            }
        }

        System.out.println("tekraredenler  :  " + tekraredenler);
        for (int i = 0; i < tekraredenler.length(); i++) {
            if (!tekrarsiz.contains(tekraredenler.substring(i, i + 1)))
                tekrarsiz += tekraredenler.charAt(i) + " ";
        }
        System.out.println("tekrarsiz  :  " + tekrarsiz);
    }
}
