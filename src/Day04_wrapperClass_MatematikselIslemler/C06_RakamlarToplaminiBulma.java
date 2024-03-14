package Day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C06_RakamlarToplaminiBulma {

    public static void main(String[] args) {
        // verilen 3 basamakli sayi isteyip
        // //rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Lütfen 3 basamakli bi tam sayi giriniz");

        int girilenSayi = scanner.nextInt();
        // rakamlari tek tek bulmaliyim
        //birler basamagini modulus ile buluruz.sayi % 10 ; 3
        //3 ü blduik artik ona ihtiyacimiz yok. 123 /10 ; 12,3 java bunu 12 diye yazdirir,
        //sayi =12 ; sonra yine modulus le 2 yi buldururz. 12%10 ; 2
        // 2 yi bulduk, artik ona ihtiyac yok 12/10=1,2 java bunu 1 diye yazdirir.
        //rakamlartoplami 3+2+1 diye yazdirirz.


        int sayi = girilenSayi ; // soruya baslarken ihtiyac olunan atamalari yap.
        int birlerBasamagi = 0 ;  // genelde kullanicidan alinan sayiyi degistirmek yerine
                                 // onu baska variable a atayiiyp onu degistirirz
                                //  kullanicidan alinann sayi sabit kalir

        int rakamToplami = 0 ;


        birlerBasamagi = sayi % 10 ;
        rakamToplami = rakamToplami + birlerBasamagi ;
        sayi = sayi / 10 ;

        birlerBasamagi = sayi % 10 ;
        rakamToplami = rakamToplami + birlerBasamagi ;
        sayi = sayi / 10 ;
        rakamToplami= rakamToplami+sayi ;
        System.out.println( " girilen " + girilenSayi+ " sayisinin rakamlar toplami : " + rakamToplami );



    }
}
