package Day12_;

import java.util.Scanner;

public class C02_sifreKontrol {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
//         asagidaki sartlari kontrol edin
//         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
//         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
//         - ilk harf kucuk harf olmali
//         - son karakter rakam olmali
//         - sifre bosluk icermemeli
//         - uzunlugu en az 10 karakter olmali


        Scanner scann = new Scanner(System.in);
        System.out.println("lütfen sifre girin:");
        String sifre = scann.nextLine();

        int flag = 20;
        int sayac=0;



        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);
        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 15;// hata varsa hep ayni degeri atayacagiz
            sayac++; // hata varsa sayac degeri 1 artacak

        }


        // son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1); // sifre.charAt(sifre.length()-1) --> karakteri döndürür


        if (!(sonHarf>='0'&& sonHarf <='9')){ // ASCII de 0-9 araligi rakamdir.
            System.out.println("Son karakter rakam olmali");
            flag=15;
            sayac++;
        }

        // sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println(" sifre bosluk icermemeli");
            flag=15;
            sayac++;
        }

        // uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){ // length uzunlugu
            System.out.println(" sifre en az 10 karakter olmali");
            flag=15;
            sayac++;
        }


        // hatalari if ile yazdirabiliriz fakat basarili sonucu else le yazdiramayiz
        // cünkü bagimsiz if de else ler bagimsiz

        // flag kullanarak sonuc yazdirma

        if (flag==20){
            System.out.println("sifre basarili");
        }else {
            System.out.println("lütfen hatalari düzelterek tekrar girin.");
        }


        // sayacla sonuc yazdrma

        if (sayac==0){
            System.out.println("sifre basarili");
        }else {
            System.out.println(" lütfen hatalari düzeltin.");
        }









        /* eger if -else kullanirsak
        + tüm hatalari sirasiyla kontrol eder
        en sonunda hata iflerine takilmazsa basarili sifre yazdirabilriiz
        - if else cümlelerinde suzgec mantigi oldugundan
        sadece 1 hatayi yazdirabiliriz.






        bagimsiz if cümleleri kullanirsak
        + sifredeki tüm hatalri yazdirabilriz
        -bagimsiz if cümleleri codun kendielri disindaki ksiimlarla ilgilenmez
        yanisifrenin basarili oldugunu yazdirabilmek icin ekstra bir kontrol
        meanizmasi kullanmayiz
         */









    }
}
