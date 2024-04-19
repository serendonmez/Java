package Day07__IfElseIfStatements_nestedIf;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        /* If else ile yazdigimiz kodlarda
        krar vermeki icin degerlendirdigimiz degiskenler birden fazla ise;
        daha amlasilir bir kod yazmak istersek ; önce degiskenlerden birini ana degiske kabul edip,
        o degiskene göre if else if else yapisi olusturun


        // ana degiskenimiz cinsiyet olsun


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lütfen cinsiyetinizi giriniz K: kadin , E: erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinzi giriniz");
        double yas = scanner.nextDouble();


        if (cinsiyet == 'E') { // sadece erkekler
            if (yas < 0 || yas > 100) {
                System.out.println("gecersiz yas.");
            } else if (yas >= 65) {
                System.out.println("erkek emekli olabilir");
            } else // geriye kalanlar = yas<65
                System.out.println("emekli olmak icin " + (65 - yas) + " yil daha calismalisiniz");

        } else if (cinsiyet == 'K') { // kadinlar if bodysi
            if (yas <= 0 || yas > 120) {
                System.out.println("gecersiz yas girdiniz");
            } else if (yas >= 60) {
                System.out.println("kadin emekli olabilir");

            } else {
                System.out.println("emekli olmak icin " + (65 - yas) + " yil daha calismalisiniz");
            }


        } else {
            System.out.println("Cinsiyetinizi K veya E girmelisiniz");
        }


    }    }

