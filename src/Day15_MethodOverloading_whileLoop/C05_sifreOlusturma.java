package Day15_MethodOverloading_whileLoop;

import java.util.Scanner;

public class C05_sifreOlusturma {
    public static void main(String[] args) {


        // Main method icerisinde kullanicidan sifre isteyin
// sifre, istenen sartlara uymadigi surece
// kullanicidan yeni sifre istemeye devam edin
// istenen sartlara uygun bir sifre girildiginde
// "Sifreniz basariyla kaydedildi" yazdirin

// sifre kontrolu icin bir method olusturun
// asagidaki sartlari kontrol edin ve kullaniciye düzeltmesi gereken
// tüm eksikleri söyleyin.
// eğer tüm şartları sağlarsa method true , sartlar saglanmazsa false dondurecektir

//ilk harf kucuk harf olmalı
//son karakter rakam olmalı
//sifre bosluk icermemeli
//uzunlugu en az 10 karakter olmali.

        Scanner scanner = new Scanner(System.in);
        String sifre= "";
        boolean sifreSonuc= false;


        while ( !sifreSonuc==false ) { //           sifreSonuc==false)
            System.out.println(" lütfen sifre girin");
            sifre= scanner.nextLine();

            sifreSonuc = sifreUygunMu(sifre);
        }
        System.out.println(" sifreniz basariyla kaydedildi");

    }


    public static boolean sifreUygunMu(String sifre){

        int flag = 20;



        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);
        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 15;// hata varsa hep ayni degeri atayacagiz


        }


        // son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1); // sifre.charAt(sifre.length()-1) --> karakteri döndürür


        if (!(sonHarf>='0'&& sonHarf <='9')){ // ASCII de 0-9 araligi rakamdir.
            System.out.println("Son karakter rakam olmali");
            flag=15; // ya da return false

        }

        // sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println(" sifre bosluk icermemeli");
            flag=15;

        }

        // uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){ // length uzunlugu
            System.out.println(" sifre en az 10 karakter olmali");
            flag=15;

        }


        // hatalari if ile yazdirabiliriz fakat basarili sonucu else le yazdiramayiz
        // cünkü bagimsiz if de else ler bagimsiz

        // flag kullanarak sonuc yazdirma



        if (flag==20){
            return true ;
        }else {
            return false;
        }







    }
}
