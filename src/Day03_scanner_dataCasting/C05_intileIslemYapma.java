package Day03_scanner_dataCasting;

public class C05_intileIslemYapma {
    public static void main(String[] args) {
        int sayi1 = 24;
        int sayi2 = 8;
        int sayi3 = 10 ;

        System.out.println( sayi1 / sayi2 );
        System.out.println( sayi1/ sayi3 );


        double dbl = 24;
        System.out.println(  dbl / sayi2);

        System.out.println( dbl / sayi3);

        int a = 27;
        int b = 4 ;



        System.out.println(a/b);
        double sonuc = a/b ;


        System.out.println( sonuc );

        sonuc = (double) a/ b ;

        System.out.println( sonuc );




        int x=257;
        byte z=(byte) x;

        System.out.println(z); //1 -->  byte in alabilecegi 127 + 128 +0 = 256 tane degeri var
        // kapasitesinin disinda deger girilirse b durumda (girilen deger)%256 degerini alir


        int o= 1649;
        int h= 1649%256;
        System.out.println("1649 %256 = 1649 Byte degeri : "+h);
        byte r= (byte)o;
        System.out.println(" r nin yeni degeri :" +r);



        // double gibi F da int a a cast edilirse tamsayi olarak deger alir . F görünmez
        float f=6.6F;
        int y= (int)f; //6
        System.out.println(y);




 
    }
}
