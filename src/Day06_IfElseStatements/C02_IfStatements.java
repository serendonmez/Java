package Day06_IfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
        bagimsiz if cümleleri kodun geriye kalanindan bagimsizdir. sarta odaklanir. sart true ise if bodysi calisir.
        sart false ise if bodysi calismaz.
         bagimsiz if cümleleri kodun geriye kalaniyla ilgilenmediginden
         birden fazla bagimsiz if cümlesi olduugnda tümünün if body si calisabilcegi gibi
         hicbirinin if bodysi calismadigi da olabilir
         */

        int a = 18 ;
        int b = 47 ;
        // Eger a>b ise " a b den büyük yazdirin "
        if (a>b ) {
            System.out.println( " a b den büyük");

        }

        // b cift ise , " bu sayilarin carpimi cift olur "
        if ( b% 2 == 0 ) {
            System.out.println( " bu sayilarin carpimi cift olur");
        }
        // a 100 den byüükse ilk sayi cok büyük
        if (a> 100) {
            System.out.println( " ilk sayi cok büyük ");

            // if parantezinin ici false ise if body calismaz.

            if (b>a);
            System.out.println("b a dan büyük");

        }

    }
}
