package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemoveMEthodu {
    public static void main(String[] args) {

        List<String > harfler = new ArrayList<>(Arrays.asList("a","r","a","t","a","s"));

        // remove(istenenObject) ==> listede varsa siler ve liste degisir
        //                           listede yoksa silemez, liste de degismez
        System.out.println(harfler); // [a, r, a, t, a, s]
        harfler.remove("a");
        System.out.println(harfler); //[r, a, t, a, s]


        harfler.remove("x");
        System.out.println(harfler); // [r, a, t, a, s]



        // remove method'u calistiginda asil amaci olan silme islemini yapar
        // delil olarak da sildi ise true, bulamadi ise false dondurur
        System.out.println(harfler.remove("s")); //true

        System.out.println(harfler); //[r, a, t, a]

        System.out.println(harfler.remove("y")); // false

        System.out.println(harfler); //[r, a, t, a]



        // eger remove(istenenIndex) kullanilirsa
        // index'i bulamama diye bir ihtimal olamayacagindan
        // true/false yerine bize sildigi elemani dondurur
        System.out.println(harfler.remove(1)); // a


        System.out.println(harfler); // [r, t, a]

        //System.out.println(harfler.remove(10));//  // IndexOutOfBoundsException

        List<String> karakterler = new ArrayList<>(Arrays.asList("9","a","%","i","#"));
        System.out.println(karakterler.removeAll(harfler)); // true

        // karakterler listesinden, harfler listesinde olan tum harfleri siler
        // karakterler listesi degisirse true, degismezse false dondurur

        System.out.println(karakterler); //[9, %, i, #] --> liestede harflerle ortak elemanlari sildi

        System.out.println(karakterler.removeAll(harfler)); // false ; ortak elemanlari olmadigi ve
        // silme islemi yapmadigi icin false yazdirir






        // Listemiz sayilardan olusuyorsa
        // girilen sayinin index mi yoksa silinecek sayi mi oldugunu
        // net olarak bilmek icin
        // Java girilen sayiyi INDEX olarak KABUL edecegini belirtir



        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,3,5,6));

        System.out.println(sayilar.remove(2)); // sildigi elemani getirir 2. indexte :-> 7

        System.out.println(sayilar); // [2, 5, 3, 5, 6]



        // EGER eleman olarak 6'yi silmek istiyorsak
        // ve index'ini bilmiyorsak
        // once silinecek sayiyi non-primitive bir variable'a atamaliyiz

        Integer silinecekSayi=6;

        System.out.println(sayilar.remove(silinecekSayi)); // true liste de 6 vardi ve silindi
        // birden fazla 6 varsa biri silindi

        System.out.println(sayilar); //[2, 5, 3, 5]


    }
}
