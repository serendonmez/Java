package Day02_variable_scanner;

import java.util.Scanner;

public class C02_scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");



        String kullaniciIsmi= scanner.nextLine();

        System.out.println("Girilen ismin buyuk harfle yazilisi : " +kullaniciIsmi.toUpperCase());
        System.out.println("Girilen ismin kücük harfle yazilisi:  "+ kullaniciIsmi.toLowerCase());







        Scanner scanner1 =new Scanner(System.in) ;
        System.out.println("Lütfen soyadinizi giriniz.");
        String kullaniciSoyIsmi= scanner1.nextLine() ;

        System.out.println("Girilen soy ismin büyyük yazilisi : " + kullaniciSoyIsmi.toUpperCase());
        System.out.println("Girilen soy ismin kücük yazilisi : " + kullaniciSoyIsmi.toLowerCase());

        Scanner scanner2 = new Scanner(System.in) ;
        System.out.println(" Lütfen iban no giriniz. ");
        int ibanNo= scanner.nextInt();




    }
}
