package Day48_Maps;

import Day47_Maps.OgrenciMapClass;

public class C02_bolumdekiOgrencilerinListesiniYazdir extends OgrenciMapClass {

    public static void main(String[] args) {


        //        2- verilen bolumdeki tum ogrencilerin
        //           isim soyisim sinif ve subelerini yazdirin

        mapeOgrenciEkle();
        bolumdekiOgrencilerListesiYazdir("mf");
        //Ali Can 11H
        //Ayse Can 10H
        //Sevgi Can 10K

        bolumdekiOgrencilerListesiYazdir("TM");
        //Veli Cem 10K
        //Ali Cem 11K
        //Sevgi Cem 11M

        bolumdekiOgrencilerListesiYazdir("Yazilimci");
        // Girdiginiz bolum hatali
    }
}
