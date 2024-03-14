package Day03_scanner_dataCasting;

public class c04_explicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 20 ;
        int sayi2 = 130 ;
        int sayi3 = 140 ;
        int sayi4 =250 ;
        int sayi5 = 520 ;
        int sayi6 = 780 ;
        double dbl = 24.5 ;


        int sayi=  (int) dbl ;
        System.out.println( " 24.5 `i integer'a  cast edersek : " + sayi);

        byte byt = ( byte) sayi1 ;
        System.out.println( "20 yi byte a cast edersek : " + byt);
        byt = (byte) sayi2 ;
        System.out.println(" 130 u byte cast edersek : " + byt);


        byt = (byte)sayi3 ;

        System.out.println( " 140 i  byte a cast edersek : " + byt);

        byt = (byte) sayi4 ;
        System.out.println( "250 byte a cast edersek :" + byt);

        byt =( byte) sayi6 ;
        System.out.println( " 780 i byte cast edersek :" + byt);






    }
}
