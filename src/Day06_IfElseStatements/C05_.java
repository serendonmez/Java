package Day06_IfElseStatements;

import java.util.Scanner;

public class C05_ {
    public static void main(String[] args) {
        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scanner= new Scanner(System.in) ;
        System.out.println( " Lütfen bir harf girin ");
        char harf= scanner.nextLine().charAt(0);

        if (harf == 'o' || harf=='O'){
        System.out.println("Ocak");
        }

        if (harf == 's' || harf=='S'){
            System.out.println("Subat");
        }
        if(harf== 'm' || harf== 'M'){
            System.out.println("Mart ve MAyis");

        }
        if (harf =='n' || harf =='N'){
            System.out.println("Nisan");
        }
        if (harf=='h' || harf=='H'){
            System.out.println("Haziran");
        }
        if (harf=='t' ||harf== 'T'){
            System.out.println("Temmuz");
        }
        if (harf == 'a' || harf =='A'){
            System.out.println(" Agustos ya da Aralik");
        }
        if (harf =='e' || harf =='E'){
            System.out.println("Eylül ya da Ekim");
        }
        if (harf == 'k' || harf== 'K'){
            System.out.println("Kasim");
        }



    }
}
