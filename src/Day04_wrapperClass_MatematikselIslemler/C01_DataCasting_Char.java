package Day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C01_DataCasting_Char {
    public static void main(String[] args) {
     // kullanicidan harf al
     // alfabede o harfden sonraki 3 harfi yazdir

        Scanner scan = new Scanner( System.in) ;
        System.out.println( "Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0) ;

       /* System.out.println( "Girdiginiz karakterden bir sonraki karakter :" +(girilenKarakter+1));
        System.out.println("Girioen krarkter ´den iki sonraki karakter :  "+ (girilenKarakter+2));
        System.out.println( "Girlen karakterden  üc sonraki karakter : " + (girilenKarakter + 3 ));+/
        // char matematiksel islemlerde ASCII degerleiyle calisitig icin A girilirse B C D nin ASCII degerlerini yazar
        // bu yüzden ASCII degil  ; char degerini yazdirmak istiyorsak char a atama yapmaliyiz.


              */

        System.out.println( "Girdiginiz karakterden bir sonraki karakter :" + (char) (girilenKarakter+1));
        System.out.println("Girioen krarkter ´den iki sonraki karakter :  "+ (char)(girilenKarakter+2));
        System.out.println( "Girlen karakterden  üc sonraki karakter : " +  (char) (girilenKarakter + 3 ));


        System.out.println("Girdiginiz karakterden bir sonraki karakter : " + (girilenKarakter+'a'));
        System.out.println("Girdiginiz karakterden iki sonraki karakter : " +(girilenKarakter+'X'));
        System.out.println("Girdiginiz karakterden uc sonraki karakter : " + (girilenKarakter+'B'));

    }
}
