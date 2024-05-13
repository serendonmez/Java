package Day48_Maps;

import Day47_Maps.OgrenciMapClass;

public class C06_yeniOgrenciEkleme extends OgrenciMapClass {


    public static void main(String[] args) {



        // oncelikle bir if ile verilen numarayi kontrol edip,
        // varolan bir numara ise uyari yazdirin

        // scanner ile sorarak map'e yeni bir ogrenci ekleyin
        mapeOgrenciEkle();

        System.out.println(ogrenciMap);

        ogrenciEkle(102); // Verilen numara zaten kayitli

        ogrenciEkle(120);

        System.out.println(ogrenciMap);
    }
}
