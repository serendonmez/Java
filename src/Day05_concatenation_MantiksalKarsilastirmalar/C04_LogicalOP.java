package Day05_concatenation_MantiksalKarsilastirmalar;

public class C04_LogicalOP  {
    public static void main(String[] args) {
         int a= 10 ;
         int b = 15;
    boolean c;
        System.out.println(  c= 15 >=b && a< 0); // c ye 15 i atamis ,
                                                        // 15>= 15 true
                                                //10 < 0 false , sonucu false yazdirir.

        c= a>=b && 3*a<4*b;
        System.out.println(c); // 10 > 15 false && 3*10 =30 < 60 true
                                // biri false ; false yazdirir.

        int d = 15;
        System.out.println( 15 >=d++ ); // c nin degerin i 1 artiir. ( ++ d den sonra arttrmayi sonra yapariz.
                                        //  önce islem yap
                                        //islem + lar yokmus gibi yapilir.
                                        //15 >= 15 true
                                        // islem sonucu true yazdirir
                                        // sonra d nin degerini 1 artiirir.
                                        // yazdirmasi icin sout yapilmali

        System.out.println( d);




    }
}
