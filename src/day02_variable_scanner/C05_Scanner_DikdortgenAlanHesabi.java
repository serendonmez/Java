package day02_variable_scanner;

import java.util.Scanner;

public class C05_Scanner_DikdortgenAlanHesabi {
    public static void main(String[] args) {





       Scanner scanner=new Scanner(System.in);
        System.out.println(" Lütfen dikdörtenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 =scanner.nextDouble();
        System.out.println("Dikdörtgenin alani :" + kenar1*kenar2);


        Scanner scan= new Scanner(System.in);
        System.out.println(" lütfen kücük kenari giriniz. ");
        int kucukKenar = scanner.nextInt();




        Scanner scanN= new Scanner(System.in) ;
        System.out.println( "lütfen büyük kenari giriniz");
        int buyukKenar= scanner.nextInt();
        System.out.println(" dikdörtgenin alani : " + kucukKenar*buyukKenar);


    }
}
