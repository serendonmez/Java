package Day14_MEthodOlusturma;

import java.util.Scanner;

public class C06_isimDüzenleme {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip, isim bosluk soyisim
        // seklinde bize donduren bir method olusturun
        // input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz

        Scanner scanner = new Scanner(System.in);
        System.out.println(" isminizi girin");
        String isim = scanner.nextLine();
        System.out.println("soyisim girin");
        String soyisim= scanner.nextLine();

        // method bize bir String döndürdugu icin
        // Ya hemen donen String'i yazdiririz
        System.out.println(ismiDuzenle(isim, soyisim));

        // veya daha sonra kullanilmak uzere kaydederiz

        String duzenlenmisIsim = ismiDuzenle(isim,soyisim);



    }


  public static String ismiDuzenle (String isim, String soyisim){ // bizden yazdirmamizi istemiyor, return etmemizi istiyor
        String duzenlenmisIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " "+ soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();

        return duzenlenmisIsim;
  }






}
