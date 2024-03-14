package Day05_concatenation_MantiksalKarsilastirmalar;

public class C00_ {
    public static void main(String[] args) {
        int a = 10 ;

        System.out.println( "a nin degerini nir artir " + ++a); //  a =11

        int b = a++ ; // b = 12 diyemiyoruz.  cünkü ayni satirda iki islem var
                        // ->b yi a ya assign et , -> a nin degerin i1 artir.
                        // postincrement oldugu icin ilk olarak b ye a yi assign ederiz.
                        //sonra a nin degerini 1 artiriz. bu durumda b = 11 a =12 olur
        System.out.println(" b nin degeri " + b); // b :11
        int c= b++ + a ; // 2. b nin degerini 1 artir.
                            // 1. b ile islem ypip c ye ata. post increment oldugu icin önce bu görev yapilir.
                       // c= 11 (b)+12 (a)  = 23 b yi sonradan artirirz = b= 12
        System.out.println(" c nin dgeri : " + c);// 23
        System.out.println( " son toplam deger :  " + (a+b+c)); // 12+12+23 =47







    }
}
