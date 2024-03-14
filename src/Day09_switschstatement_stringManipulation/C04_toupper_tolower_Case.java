package Day09_switschstatement_stringManipulation;

import java.util.Locale;

public class C04_toupper_tolower_Case {
    public static void main(String[] args) {
        String str = "Java Candir";

        //str i buyuk harf olarak yazdirir.

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // string de variable a atama yapilmadikca
        //methodlarla yapilan degisiklikler kalici olmaz

        // eger methodlarla yapilan degiiskligi kalici olmasini istersek
        //variable a atama yapmak zorundayiz

        str=str.toUpperCase();
        System.out.println(str); // str = JAVA CANDIR kalici olur. bu satirdan sonra

        // eger kücük harfe veya büyük harfe cevirirken
        // local bialfabeye uygun olarak cevirme yapmak istersek


  //     System.out.println(str.toLowerCase(Locale.GERMANY));

  //     System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candir
      // klavye neyse onu yazar


        // metindeki 2. harfi yazdirin
        System.out.println(str.toUpperCase().charAt(1));
        // metindeki sonuncu harfi yazdirin r
        // bu yazim dinamik bi cod degildir
        // str degistirilse de cod hep 10. indeksteki harfi yazdirir.
        System.out.println(str.charAt(10)); // indeks 0 dan baslar 0-1-2-..
        //sondan 3. harfi yazdirin
        // bu cod dinamik olmaz sondan 3. harfi degil
        // 8. indeksi yazdirir.
        System.out.println(str.charAt(8));









    }
}
