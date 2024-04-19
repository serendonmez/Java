package Day24_ArrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // for each Loop (enhanced) gelismis for loop olarak bilinir
        //


                // verilen bir arraydeki
        // tüm sayilari toplayip , yazdirin

        int[] sayilar= {3,5,7,9,2,17,9,3,58,2};

        int toplam =0;
        for (int i = 0; i < sayilar.length ; i++) {
            if(sayilar[i] %2!=0 ){
                toplam+=sayilar[i];
            }

        }

        System.out.println(toplam);

        toplam =0;



        for ( int each : sayilar  ) { // bana sayilar arr ndeki her sayiyi getir. ( siralamanin bir önemi yok)
            if (each %2 != 0){
                toplam +=each;  // direkt each diye yazdir

            }

        }

        System.out.println(toplam);


    }
}
