package Day48_Maps;

import Day47_Maps.OgrenciMapClass;

public class C05_SinifArtir extends OgrenciMapClass {

    public static void main(String[] args) {


        // okuldaki tum ogrencileri bir ust sinifa gecirin
        // 12.siniftaki ogrencileri mezun yapin
        // mezun olan ogrencilere bir sey yapmayin
        mapeOgrenciEkle();
        System.out.println(ogrenciMap);

        sinifArtir();

        System.out.println(ogrenciMap);

        sinifArtir();

        System.out.println(ogrenciMap);
    }



}
