package Day08_ternary_switchstatements;

import java.util.Scanner;

public class C01_ {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in) ;
        System.out.println( " Lütfen aldiginiz ürün adedinizi giriniz");
        int urunAdedi= scanner.nextInt();

        System.out.println( " Lütfen aldiginiz  ürünün indirimsiz fiyatini giriniz :");
        double indirimsizFiyat = scanner.nextDouble();

        double toplamFiyat = urunAdedi*indirimsizFiyat ;
        System.out.println(" müsteri kartiniz var mi ? E: Evet. H: Hayir");
        char kartVarMi= scanner.next().toUpperCase().charAt(0);

        // müsteri karti ana degisken olsun

        if (kartVarMi == 'E') {



        } else if (kartVarMi=='H') { // karti olmayanlar



        }else { // yanlis giris yapanlar
            System.out.println( " Kartiniz var mi sorusuna E veya H girmelisiniz... ");
        }



    }
}
