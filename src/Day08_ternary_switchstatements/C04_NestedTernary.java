package Day08_ternary_switchstatements;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // verilen sayi icin asafidaki 3 durumdan uygun olani yazdirin,
        // - sayi pozitif
        // - sayi negatif
        //-  0 sayi poz veya negatif degil

        int sayi = 10 ;
         if (sayi >0) {
             System.out.println( " sayi pozitif ");
         }else if (sayi<0) {
             System.out.println(" sayi negatif");
         }else {
             System.out.println("0 pozitif veya negatif degil");
         }

        System.out.println(sayi >0 ? " sayi pozitif " : " sayi negatif"   );


         // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scanner = new Scanner( System.in) ;
        System.out.println( " Lütfen notunuzu giriniz");
        double not = scanner.nextDouble();

        System.out.println( not >= 50 ? " sinifi gectin : " : " Kaldin");

            // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scann = new Scanner( System.in) ;
        System.out.println( " Lütfen iki sayi giriniz");
        double sayi2 = scann.nextDouble();
        double sayi3 = scann.nextDouble();


        System.out.println( sayi2> sayi3 ? sayi3 : sayi2);











    }
}
