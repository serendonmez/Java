package Day04_wrapperClass_MatematikselIslemler;

public class C04_WrapperClass2 {
    public static void main(String[] args) {
        // string olarak verilen iki tam sayiyi toplayin

        // veriyi internetten aliyorsak sayiyi int olarak yazamayiz cünkü bir metinden copy yapiyoruz.


        String fiyatstr1 = "90" ;
        String fiyatstr2 = "45" ;
        System.out.println( fiyatstr1+fiyatstr2); // 2345   Java Stringi yanyana yazdiriri. cünkü metin olarak algilar.
                    // toplamayi yapmak icin once String olarak verilen fiyatlari Integer a cevirmeliyiz.


        System.out.println(Integer.parseInt(fiyatstr1) + Integer.parseInt(fiyatstr2));
        // bölme

        System.out.println(Integer.parseInt(fiyatstr1)/ Integer.parseInt(fiyatstr2));

        // iki sayiyi toplayin

        String fiyatstr3 = "23.56" ;
        String fiyatstr4 = "45.21" ;

        System.out.println(Double.parseDouble(fiyatstr3) + Double.parseDouble(fiyatstr4));


    }
}
