package Day05_concatenation_MantiksalKarsilastirmalar;

public class C03_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a= 5 ;
        System.out.println( 2*a+4 ==14); // == dogru mu? demektir.
        // esittir den farkli olarak== ( double icon sign) da iki tarafta da islem olabilir, variable olabilir.
        System.out.println( a+4==2*a-1);  // 9==9 -->true

        int b= 3;

        //System.out.println(b= 3*a-7); // burada esitlik assigment isareti atama yapar.


        System.out.println("b :" + b); // b=8 bi önceki satirda b ye 8 atadigi icin.

        System.out.println(b==2*a+8); // b esit mi 18 ile --> false


        // java da esit degil icin != kullanilir
        System.out.println(a+3 !=2*b-1 ); //8 !=5 true

        System.out.println(2*a != b*2+4); // 10 !=10 fLSE

        // >< isarete´leri java dada vardir
        System.out.println(2*a<b-3); //10 < 0 false

        System.out.println(a +2 < b*3 ); // 7 <9 true
         // !> <! diye bisey yoktur.

        // !!!!!!!! Java da basa yazilan ünlem mantiksal degeri terine cevirir,
        // a 5 b 3

        System.out.println( !(a+7>b + 8 )); // 12 >11 normalde true olan degeri  !() ile false yaptik-







    }
}
