package Day48_Maps;

import Day47_Maps.OgrenciMapClass;

public class C01_OgrenciNumarasinaGoreListeYazdir extends OgrenciMapClass {



    public static void main(String[] args) {

        //Ogrenci numarasi olarak verilen min ve max (sinirlar dahil) numaralar
        //arasindaki tum ogrencilerin numara, isim, soyisim, sinif ve subelerini yazdirin
        mapeOgrenciEkle();
        System.out.println(ogrenciMap);

        ogrencininNumarasinaGoreListeYazdir(103,105);
        //103 Ali Cem 11 K
        //104 Ayse Can 10 H
        //105 Sevgi Cem 11 M

        ogrencininNumarasinaGoreListeYazdir(102,103);
        //102 Veli Cem 10 K
        //103 Ali Cem 11 K

    }



}
