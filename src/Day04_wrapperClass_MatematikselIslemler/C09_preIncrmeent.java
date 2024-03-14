package Day04_wrapperClass_MatematikselIslemler;

public class C09_preIncrmeent {
    public static void main(String[] args) {
        // sayi++ ve sayi-- islemlerine özel olaral
        // ++sayi ve -- sayi seklinde yazilabilme özelligi vermsitir.
        // sayi++ ve ++sayi ayni islemi yapar



        int sayi = 20 ;
        sayi++;

        System.out.println( sayi);


        int a = 20 ;
        ++a;
        System.out.println("a: " + a);         // sayi++ = ++sayi ikisi de 1 artiitir
                                    // aralarindaki fark islemin yapildigi satirda ikici islem yapilirsa ortaya cikar.

        int b = 20 ;
        System.out.println( "b : " + b++); // b : 20 ilk göre :  b nin degerini 1 artir.
        // görev 2 : b nin degerini yazdir.



        int c = 20 ;


        System.out.println( " c :" + ++c ); // c:21



        System.out.println( "b :" + b + ", c :" + c ); // b : 21, c = 21

        int d = 10; // d = 10  d = 11
        int e = ++d; // e = 1. görev 1 artir 2. görev assign et  e= 11
        System.out.println("d: " + d + " e: " + e  ); // 11 + 11

        int f = 20 ;
        int g = f++;
        System.out.println( " f : " + f+ " g : " + g); // f = 21 g =20










        int w = 30 ;

        w++;

        int j= 45 ;

        System.out.println( " w: " +w);
        System.out.println( " w: " + --w);
        System.out.println( " j : " + j++); // iki islem var biri yazdirma digeri artirma
                                            // + lar j den sonra gediigjden önce yazdirma ilsemi gerceklesir.
        System.out.println("j :" + j ); // j yi sonradan yazdirirsak
        System.out.println( "j : " + --j);

        int z = 10 ; // yazdirmada olan islem önceligi kurali assign ederken de var
        int x = a++; // z: 10 du x = 10 sonra z = 11

        System.out.println( "z: " + z+ " x : " + x ); // z: 11 x: 10
        System.out.println( "z : "+ z); // z = 11 ?
        System.out.println( "x: " +x ); // x = 10 ?








    }
}
