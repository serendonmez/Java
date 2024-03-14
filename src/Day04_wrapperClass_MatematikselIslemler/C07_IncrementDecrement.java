package Day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C07_IncrementDecrement {
    public static void main(String[] args) {
        int sayi =10 ;
        sayi = sayi + 5 ;
        System.out.println(sayi);

        sayi += 5 ;
        System.out.println( sayi);

        int artis = 30 ;
        sayi += artis ;
        System.out.println( sayi);

        sayi = 2 ;
        sayi = sayi * 3 ;
        System.out.println( sayi);

        sayi *= 5 ;
        System.out.println(sayi);


        int kat= 7 ;


        sayi = 81 ;
        sayi *= kat ;
        System.out.println( sayi );

        int bolunme = 3 ;
        sayi = 969;
        sayi /= bolunme ;

        System.out.println( sayi);


        // girilen 3 basamakli tam  sayiyi 3 bölup yazdir
        Scanner bursa = new Scanner(System.in) ;
        System.out.println( " Lütfen 3 basamakli tam sayi giriniz :");
        int girilenSayi= bursa.nextInt();


        int bolunme1= 3;

        girilenSayi /= bolunme1 ;



        System.out.println("Girilen " + ( girilenSayi) + "  sayisinin 3 e bölümü : " + ( bolunme1));







    }
}
