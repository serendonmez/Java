package Day07__IfElseIfStatements_nestedIf;

import java.util.Scanner;

public class C06_indirim {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // az alirsa %10 indirim yapin

        //      Scanner scanner = new Scanner(System.in);
        //      System.out.println(" Lütfen ürün adedinizi giriniz");
        //      int urunAdedi = scanner.nextInt();
        //      System.out.println("aldiginiz ürünlerin indirimsiz fiyatini girin");
        //      double urunFiyati = scanner.nextDouble();
        //      System.out.println("müsteri kartiniz var mi? 'E' / 'H'");
        //      char musteriKArti = scanner.next().toUpperCase().charAt(0);


        //      if(urunAdedi<0 ||urunFiyati<0){
        //          System.out.println("gecerisiz bilgi");
        //      } else if  (musteriKArti == 'E' && urunAdedi > 10) {
        //          System.out.println("ödemeniz gerek tutar: " + (urunFiyati * 80 / 100));
        //      } else if (musteriKArti == 'E' && urunAdedi <= 10) {
        //          System.out.println("ödemeniz gerekn tutar: " + (urunFiyati * 85 / 100));
        //      } else if (musteriKArti == 'H' && urunAdedi >=  10) {
        //          System.out.println("ödemeniz gereken tutar: " + (urunFiyati * 85 / 100));
        //      } else if (musteriKArti == 'H' && urunAdedi < 10) {
        //          System.out.println("ödemeniz gereken tutar: " + (urunFiyati * 90 / 100));
        //      } else {
        //          System.out.println("gecersiz bilgi");
        //      }
        //


        //nested la yaparsak
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // az alirsa %10 indirim yapin

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Lütfen ürün adedinizi giriniz");
        int urunAdedi1 = scanner1.nextInt();
        System.out.println("aldiginiz ürünlerin indirimsiz fiyatini girin");
        double urunFiyati1 = scanner1.nextDouble();
        System.out.println("müsteri kartiniz var mi? 'E' / 'H'");
        char musteriKArti1 = scanner1.next().toUpperCase().charAt(0);

        // ana degsiken = müstri karti

        if (musteriKArti1 == 'E') { // musteri karti olanlar
            if (urunAdedi1 >= 10) {
                System.out.println("ürün tutariniz: " + (urunFiyati1 * 80 / 100));
            } else if (urunAdedi1 < 10) {
                System.out.println("ürün tutariniz : " + (urunFiyati1 * 85 / 100));

            }


        } else if (musteriKArti1 == 'H') {
            if (urunAdedi1 >= 10) {
                System.out.println("ürün tutariniz : " + (urunFiyati1 * 85 / 100));
            } else if (urunAdedi1 < 10) {
                System.out.println("ürün tutariniz: " + (urunAdedi1 * 90 / 100));
            }

        }else {
            System.out.println("gecersiz tuslama");}


    }    }