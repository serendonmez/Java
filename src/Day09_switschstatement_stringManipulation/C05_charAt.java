package Day09_switschstatement_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {
        String str = "java Candir"; // indeksi J=0
        //a=1 v=2 a=3......
        System.out.println(str.charAt(0));

        // metindeki harfi buyuk olarak yazdirin
        str.charAt(1);// bu kodun sonucu bir char bu yüzden tuUppercase i chardan sonra yapamayiz.
                            // methodlar stringe ait. stir charlasmadan method istiyorsak yazmaliyizi.
        System.out.println(str.toUpperCase().charAt(1));

        // metindeki 2. harfi büyük yazdiriin. 2. harf =1.indeks
        System.out.println(str.toUpperCase().charAt(1)); //A
        // metindeki sonuncu harfi yazdirin :
        System.out.println(str.charAt(10)); // r parantez icine indek yaziyoruz



        //sondan 3 harfi yazdirin

        System.out.println(str.charAt(8)); //


        // bir string teki karakter sayisina o Stringin length i denir
        // length 1 den baslar, indeks 0 dan. // str icin düsünürsek
        // length --> 11 , son karakterin indexi --> 10 ( length -1 )


        // diamic cod
        // kullanicidan alinan input a bagli olmaksizin
        // her zaman kendini dinamik olarak dutenleyip
        // istenen sonucu veren coddur

        // sonuncu harfi dinamic codla yazdirin

        System.out.println(str.charAt(str.length() - 1));
        // sondan 3. harfi yazdir
        System.out.println(str.charAt(str.length() - 3)); //

        // olmayan bi lengtg i sorarsa leght 16 ise
        System.out.println(str.charAt(16)); // girilen index sinirlarnin disinda en fazla length-1 yazdirabiliriz

        // java compile time da ( data derleme zamaninda)
        // kullanilan variable arin degerlerini göremez
        // sadece turleri gorur
        //data turleri acisindan kod da bir sorun varsa
        // compile time da bunu farkeder ve altinni cizer
        // buna compile time error diyoruz(CTE)

        // nacak degeri göremnedigi icin
        // yanlnlis degerleri sebep olacagi hatalri
        //compile ntime fark edemez
        // deger hatalarini kodlari calistirmaya basladiktan sonra farkeder.
        // bu tur hatalarna calismaya basladiktan spnra fanrkedildigi icin
        // NRun Time Error (RTE) denir



    }
}
