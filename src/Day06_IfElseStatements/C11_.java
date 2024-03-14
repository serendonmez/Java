package Day06_IfElseStatements;

import java.util.Scanner;

public class C11_ {
    public static void main(String[] args) {
        // Kullanicidan sayi isteyin
        // sayi 100 den kücükse tebrikler kazandiniz
        //sayi 100 den kücük deiglse
        // malesef u defa olmadi yazdirn





        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lütfen bir sayi giriniz : ");
        double sayi= scanner.nextDouble();
        if (sayi<100) {
            System.out.println("tebrikler kazandiniz");
            System.out.println("lütfen hediyenizi almayi unutmayin");
        }else {
            System.out.println("malesef bu defa olmadi");  System.out.println("tekrar deneyin");}














     //  double sayi = scanner.nextDouble();
     //  if (sayi < 100) {
     //      System.out.println(" tebrikler kazandiniz ");
     //      {// if else cümlelerinde süslü {} kullanmak zrunda degildri
     //          // ancak eger {} kullnilmazsa if body si olarak sadece tek satir cod yazilir 2. satiri yazilmaz
     //      }else
     //      {
     //          System.out.println(" maalesef bu defa olmadi ");
     //      }
     //  }
    }

}