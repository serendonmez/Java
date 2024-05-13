package Day48_Maps;

import Day47_Maps.OgrenciMapClass;

public class C03_NumaraIleSoyIsimUpdate extends OgrenciMapClass {

    public static void main(String[] args) {

        // verilen numarali ogrencinin soyismini verilen soyisim olarak update edin
        // ornek : 103 numarali ogrencinin soyismini Yilmaz yap
        mapeOgrenciEkle();
        System.out.println(ogrenciMap);

        NumaraIleSoyIsimUpdate(105,"Sezen");
        NumaraIleSoyIsimUpdate(104,"tiknaz");
        System.out.println(ogrenciMap);



    }
}
