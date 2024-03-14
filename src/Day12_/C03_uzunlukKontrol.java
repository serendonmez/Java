package Day12_;

import java.util.Scanner;

public class C03_uzunlukKontrol {
    public static void main(String[] args) {

        //Soru 6 : Kullanicidan bir String alin,
//         String'in uzunlugu cift sayi ise tam ortasina :) ekleyin,
//         String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        // kullanici sidika girse --> 6 ilk yarisi + :)+ ikinci yarisi
        // Seren uzunluk ---> 5   5/2. indexi replace  :)

        Scanner scann = new Scanner(System.in);
        System.out.println("lütfen isim girin:");
        String isim= scann.nextLine();

        if (isim.length()%2==0){ // sidika uzunluk ---> 6 ilk yarisi + :) + ikinci yarisi



            System.out.println(isim.substring(0,isim.length()/2)+ ":)"+ // substring te aralik verirken
                    // sona kadar yazdirmayacaksak 4,6 arasini yazdir derken kullaniriz
                    (isim.substring(isim.length()/2))); // sadece _,_ de ilkini girerseksonuna kadar yazdirir
                                                                // 7 harfli kelimede kelime.length(4) 4,5,6,7





        }else {         // seren uzunluk -->5    5/2 +:) + 5/2 +1  5/2 ile 2,5 de int 2 yi yazdirir.
            // ancak substring son karakteri yazdirmaz. yani (0, 2 bucuk) 0 ,1. indeksteki harfleri yazdirir.
            System.out.println(isim.substring(0, isim.length() / 2)+ " :) "
                    +isim.substring(isim.length()/2+1)); // 0 dan baslayip
                                                                  // yazdirmiyorsak sona kadar yazdirir.


        }







    }
}
