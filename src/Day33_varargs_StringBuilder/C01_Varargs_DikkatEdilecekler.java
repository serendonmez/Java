package Day33_varargs_StringBuilder;

public class C01_Varargs_DikkatEdilecekler {
    public static void main(String[] args) {
        // verilen farkli adetlerdeki sayilarin
        // sonuncu haric geriye kalanlari toplayip
        // son sayi ile bu toplami carpip yazdiran bir method olusturun
      //  islem (3,4,5,6,789,654);
        methodA(3,4); // burada varargs icin deger girilmese de CTE vermez


    }

   // public static void  islem ( int... bastakiSayilar, int sonSayi){
    // }


    /* ONEMLI NOT

    varargs in kapasites sinirlamasi yoktur ; verilen her sayiyi almak isteyecektir , bu durumda eger
     parametre olarak yazilan varargs tan sonra baska bir parametre yazarsaniz varargs kendinden sonraki
     parametreye hic bir element birakmaz, bu durumda method calismaz

     kural 1. Varargs her zaman son parametre olmali
     kural 2. Kural 1 den dolaydi bir method ta birden fazla Varargs parametre olamaz
     */

    public static void methodA(int i, int j, int... k) {

        System.out.println(k.length);

    }









}
