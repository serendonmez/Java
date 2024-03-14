package Day13_forLoop_nested_forLoop;

import java.util.Scanner;

public class C04_StringTersMEtinKAydetme {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        //orn : input : Java candir ise output ne olmali  ters metin:ridnac avaJ


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bi metin giriniz");
        String metin = scanner.nextLine();
        String tersMetin = ""; // ridnac...// bizden istenileni kaydetmemiz icin
                                           //bir variable olusturmaliyiz.



        for (int i =metin.length()-1 ; i>=0 ; i--){
            tersMetin+= metin.charAt(i); // concatenation yapiyoruz
            // yazdirma sorularinda sout(metin.charAt (i) ) yaptik
            // kaydetme sorularinda tersmetin+= metin.charAt(i)
            // yapiyoruz. yani her yeni i degeri ters metne sirayla
            // string deger olarak eklensin.

        }
        System.out.println(tersMetin);

        // verilen metnin palindrome (tersten ve düzden ayni metin )orn : madam
        // olup olmadiigni yazdirin.


        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println(" verilen metin palindromdur.");
        }else {
            System.out.println("verilen metin palindrom degildir.");
        }





    }
}
