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
        // a/b yi ondalikli yazdir. int oldugu icin bunu 6,75 degil 6 yazdirir


        System.out.println(a/b);
        double sonuc = a/b ;


        System.out.println( sonuc );

        sonuc = (double) a/ b ; // ??int double a auto widening'i java otomatik kendi yapiyor demistik
                                 // burda double atadik neden

        System.out.println( sonuc );

 
    }
}
