package Day03_scanner_dataCasting;

public class C03_Casting {
    public static void main(String[] args) {

        char ch1= '$' ;
        byte byt1 = 23 ;
        float flt1 = 45.2F ;
        String str ="Java candir" ;
        double dbl = 44.1 ;

        boolean bl1 = true ;
        int tamsayi = 20 ;




        int sayi = 20 ;

        double dbl1 = sayi ;



        System.out.println( dbl1   );


        dbl = byt1 ;
        dbl = tamsayi ;
        dbl = flt1 ;

        flt1 =byt1 ;
        flt1 = tamsayi ;

         // flt1 = dbl1 ;
        tamsayi = byt1 ;

        // expilicit narrowing : kücük alandakini büyüge alma
         flt1 = (float) dbl1 ;

         tamsayi = (int) dbl ;

         byt1= (byte) tamsayi;
                byt1 =(byte)flt1;





    }
}
