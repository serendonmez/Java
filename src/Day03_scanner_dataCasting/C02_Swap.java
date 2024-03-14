package Day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Lütfen 1. sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println(" Lütfen ikinci sayiyi giriniz.");
        int sayi2 = scanner.nextInt() ;
         int temp = 0 ; // gecici variable kendimiz olusturduk.

         temp= sayi1 ;
         sayi1 = sayi2 ;
         sayi2 = temp ;

        System.out.println(" sayilarin yerini degistirdim" +
                "\nSayi1 : " + sayi1 + ", \nSayi2 : " + sayi2 + "oldu"







        );

    }
}
