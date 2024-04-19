package Day02_variable_scanner;

import java.util.Scanner;

public class C04_Scanner_IlkHarfiYazdirma {
    public static void main(String[] args) {

        // kullanicidan metin iste ve sadece  ilk harfi büyük harf olarak yazdir.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin = scanner.nextLine();


        System.out.println(metin.toUpperCase(). charAt(0)); // sadece ilk harf ve büyük

        System.out.println("Lutfen bir metin daha giriniz");
        char ilkHarf = scanner.nextLine() . toUpperCase(). charAt(0) ;
        System.out.println("ikinci metin ilk harf: " + ilkHarf);






    }
}
