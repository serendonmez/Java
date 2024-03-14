package Day05_concatenation_MantiksalKarsilastirmalar;

public class C02_Concatenation {
    public static void main(String[] args) {

        String  s1 = "Java";
        String  s2 = "Candir";
        String  s3 = " ";
        String  s4 = "";

        int a = 5;
        int b = 4;

        // sadece yukardaki variable'lari kullanarak
        // asagida verilen metinleri yazdirin
        //Java 54
        System.out.println( s1+s3+a+b);


        //1 Java
        System.out.println(a-b+s3 + s1);

        //Java 9
        System.out.println( s1+ s3+ (a+b));

        // Candir 20

        System.out.println(s2+a*b);

        //45Java .> once metinlestirmek gerekir.

        System.out.println(b+(a+s1));
        // baska yöntem basa hiclik koyulabilir-->""
        System.out.println(""+b+a+s1 );

        String str = "45" ;
        // bu ifadeyi int e cevirmek icin
        System.out.println( Integer.parseInt(str)+ 1); // 46


        //String str1 = 59 ; bunu kal etmez deger int ait cevirmek icin ;
        String str1=""+59;
        System.out.println( str1);









    }
}
