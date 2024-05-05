package Day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C06_RakamlarToplaminiBulma {

    public static void main(String[] args) {
        // verilen 3 basamakli sayi isteyip
        // //rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Lütfen 3 basamakli bi tam sayi giriniz");

        int girilenSayi = scanner.nextInt();


        int sayi = girilenSayi ;
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
