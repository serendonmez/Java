package Day02_variable_scanner;


import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lütfen bir tam sayi girin");

        int girilenSayi = scanner.nextInt();
        System.out.println("Girilen sayinin karesi : "+ girilenSayi*girilenSayi);

        Scanner Scanner= new Scanner(System.in);

        System.out.println(" Lütfen bir tam sayi giriniz. ");
        int GirilenSayi= Scanner.nextInt();
        System.out.println("Girilen Sayinin karesi: "+ GirilenSayi*GirilenSayi);

        Scanner Scan = new Scanner(System.in) ;
        System.out.println(" Lütfen bir kenar uzunlugunu giriniz");

        int uzunluk = scanner.nextInt();
        System.out.println("Karenin alani : " + uzunluk* uzunluk);





    }



}
