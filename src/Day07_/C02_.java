package Day07_;

import java.util.Scanner;

public class C02_ {
    public static void main(String[] args) {


         // kullanicidan bir sayi al
        // sayi <0 ise negatif sayi yazdir
        //  negatif olmayan sayilardan
        //  tek basamakli olanlar icin " Rakam" ;
        //   iki basamakli sayilar icin "Sayi",
        // uc basamakli sayilar icin "Buyuk sayi" yazdirin


        Scanner scanner = new Scanner(System.in) ;
        System.out.println( " -lütfen bir tamsayi giriniz :");
        int girilenSayi= scanner.nextInt();


        if ( girilenSayi<0 ) {
             System.out.println(" negatif sayi");                   // ayni stirdaysak süslü parantez e gerek yok
        }else if ( girilenSayi < 10 ){ System.out.println(" Rakam");
        }else if (girilenSayi <100 ) {
            System.out.println(" sayi");
        }else if (girilenSayi< 1000) {
            System.out.println( "Büyük sayi");  //verilen görev sonucu yazdigimiz cod else ile bitmeyebilir.
        }                                       // EGER ;
                                                // if, else if, ...., cümleleri else ile bitmiyorsa
                                                // bazi degerler icin hicbir if body si calismayacagini
                                                // göz önünde bulundurmaliyiz.







    }
}
