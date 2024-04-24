package Day14_MEthodOlusturma;

public class C01_Return {
    public static void main(String[] args) {
        //her method biz is yapacak sekilde olusturulur.
        //Biz methodlarin yaptiklari islem sonuclarinda bize ne döndürdüklerine bakariz.

       // methodlarin islem sonucu verilen parametrelere göre degisecegi icin return kelimesi
        // daha cok data türünü belirtir.
        // bize ne return eder ? sorusunun cevabi data türüdür.




        String str= "Java kolaydir";

        System.out.println(str.substring(2, 3));


        // bazi methodlar görevlerini yaparlar ama bize herhangi bir data türünde
        // sonuc döndürmezler
        //bu tur methodlarin return type i void olur

        str.substring(7);
        // substring methodu bize String dondurur
        // 28. satirdaki kid calisir
        //ve bize "laydir " return eder
        // ancak donen "laydir" i biz hicbir islem yapamadigimzi icin goremeyiz.

        //bize sonuc return eden bir method kullandigimizda,
        // sonucu kullanmka icin 2 alternatifimiz var
        // 1. direk yazdirip konsolda sonucu gorebiliriz.
        //2. görevde yazdirmamiz istenmiyorsa;
        // bir variable a kaydedebiliriz
        // ilerde kullanilmak üzere

        System.out.println(str.substring(0,str.length() / 2));



    }
}
