package Day11_stringManipulations;

public class C01_lastIndexOf {
    public static void main(String[] args) {


        String str = "Java cok zevkli";


        // metnin kac karakter oldugunu yazdirin .---> length

        System.out.println(str.length()); // 15 1 den baslar

        // son karakteri yazdirin --> length-1= index

        System.out.println(str.charAt(str.length() - 1)); //i


        // str 'da z harfi kullanilmis mi ?

        System.out.println(str.contains("z")); // true

        // str'da ilk k'nin index'ini yazdirin

        System.out.println(str.indexOf("k")); // case sensitive

        // str da K var mi
        System.out.println(str.contains("K")); //false , kücük k var


        // str'da "cok" kelimesinin index'ini yazdirin

        int cok =str.indexOf("cok");
        System.out.println(str.indexOf("cok")); // 5.

        // str'da k'nin son kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("k"));//12

        // // K nin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("k", 12 - 1));

        int KninsonIndexi= str.lastIndexOf("k");
        int KninsondanBiOncekiIndexi =str.lastIndexOf("k",KninsonIndexi-1);
        System.out.println(KninsondanBiOncekiIndexi);

        // // metin de kullanilan son "cok" kelimesinin index'ini yazdirin

        System.out.println(str.lastIndexOf("cok"));//5


        // metin'de kullanilan ilk x harfinin index'ini yazdirin

        System.out.println(str.indexOf('x')); // -1 c+nkü str da x harfi yok.


        // str da kullanilan son w harfinin indexini yazdirn
        // olmayan indexi 0 la veremez cünkü 0 in arfi var bu yüzden -1
        System.out.println(str.lastIndexOf("w")); // -1





    }
}
