package Day04_wrapperClass_MatematikselIslemler;

public class C04_WrapperClass2 {
    public static void main(String[] args) {
        // string olarak verilen iki tam sayiyi toplayin

        // veriyi internetten aliyorsak sayiyi int olarak yazamayiz cünkü bir metinden copy yapiyoruz.


        String fiyatstr1 = "90" ;
        String fiyatstr2 = "45" ;
        System.out.println( fiyatstr1+fiyatstr2); // 2345   Java Stringi yanyana yazdiriri.
        // cünkü metin olarak algilar.



        System.out.println(Integer.parseInt(fiyatstr1) + Integer.parseInt(fiyatstr2));
        // bölme

        System.out.println(Integer.parseInt(fiyatstr1)/ Integer.parseInt(fiyatstr2));

        // iki sayiyi toplayin

        String fiyatstr3 = "23.56" ;
        String fiyatstr4 = "45.21" ;

        System.out.println(Double.parseDouble(fiyatstr3) + Double.parseDouble(fiyatstr4));





        String not1 = "56";
        String not2= "87";
        String not3 = "100";

        int z= Integer.parseInt("65"); //
        System.out.println(z);
        int not4= 32; // 65 + 32 = 97
        int k= z+not4;

        System.out.println( k);
        int not5 = 65;
        int not6 = 74;

        double ort=( Double.parseDouble(not1)+Double.parseDouble(not2)+Double.parseDouble(not3))/3;
        System.out.println(ort);


        double toplam= Double.parseDouble(String.valueOf(not4+not5+not6));
        System.out.println(toplam);

    }
}
