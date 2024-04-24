package Day12__stringManipulations_forLoop;

import java.util.Scanner;

public class C03_uzunlukKontrol {
    public static void main(String[] args) {

        //Soru 6 : Kullanicidan bir String alin,
//         String'in uzunlugu cift sayi ise tam ortasina :) ekleyin,
//         String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.



        Scanner scann = new Scanner(System.in);
        System.out.println("lütfen isim girin:");
        String isim= scann.nextLine();

        if (isim.length()%2==0){



            System.out.println(isim.substring(0,isim.length()/2)+ ":)"+
                    (isim.substring(isim.length()/2)));




        }else {
            System.out.println(isim.substring(0, isim.length() / 2)+ " :) "
                    +isim.substring(isim.length()/2+1)); // 0 dan baslayip
                                                                  // yazdirmiyorsak sona kadar yazdirir.


        }







    }
}
