package Day06_IfElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_ {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa
        // ”Uc ile bolunebilen sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.



         Scanner scannner = new Scanner(System.in);

        System.out.println( " Lütfen pozitíf bir tam sayi giriniz : ");

        int girilenSayi= scannner.nextInt();
        if (girilenSayi % 3 ==0 ){
            System.out.println("uc ile bölünebilen "); } ;


        // Kullanicidan bi ücgenin üc kenar uzunlugunu alin.
        // ücgen eskenarsa eskanr ücgen yazdirin


        System.out.println(" ücgenin kenar uzunluklarini giriniz");
        int kenar1 = scannner.nextInt();
        int kenar2 = scannner.nextInt();

        int kenar3 = scannner.nextInt();
        if (kenar1 ==kenar2 && kenar2==kenar3&&kenar1>0 ) {
            System.out.println(" ücgen eskanr ücgendir");
        }








    }
}
