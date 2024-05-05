package Day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C66 {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli sayi isteyip
        //   rakamlar toplamini bulun.


        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Lütfen 3 basamaklli bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        // birler basamagi bulma 10  a bölerek yapilir
        //java 10 böldügünde 123 /10 =12,3 bunu 13 olarak yazidirir yani birler basamagini vermez,
        // bu yüzden kalani bulma yoluyla yani modulus ile yapiir.
        // 123% 10 kalan 3 tür birler basamagi bu sekilde elde edilir. birler basamagi=3
        // 3 ü bulduktan sonra 123 /10 =12,3 -->12 yazdirip bunun modulus ini aliriz
        // 12%10 -- > kalan 2 birler basamagi= 2,
        // sonra 12/10 =1,2 = java 1 olarak yazdirir. birlerBasamagi=1
        //
        // sayi = 123
        int sayi =girilenSayi ;
        int birlerBasamagi= 0;
        int rakamlarToplami= 0;

        birlerBasamagi = sayi % 10 ;
        rakamlarToplami= rakamlarToplami+ birlerBasamagi ;
        sayi= sayi /10 ; // 12,3 =12

        birlerBasamagi = sayi%10 ; // 12 %10 = 2
        rakamlarToplami= rakamlarToplami + birlerBasamagi ; // 0+ 3 + 2 =
        sayi= sayi /10 ;    // sayi =12 / 10 = 1,2 -->1




        System.out.println("Girilen " + (girilenSayi)+ " Sayisinin rakamlari toplami : " + (rakamlarToplami+sayi));





















    }
}
