package Day15_MethodOverloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {


        // tekrar sayisi belli olmayan isimleri
        //  while loop ile yapmak daha avantajlidir.



        // kullanicidan toplanmak üzere tam sayilar isteyin
        // sayilarin toplami 500 veya daha fazla olursa
        // sayi istemyi durdurup toplami yazdirin.


        Scanner scanner = new Scanner(System.in);

        int sayi=0;
        int toplam =0;

        while (toplam <500) {

            System.out.println(" toplanmak üzere tam sayi giriniz: ");

            sayi = scanner.nextInt(); // loopun icinde kullaniciya yazdirdigimiz icin
            // döngüdeki sart saglandikca  kullanicidan sayi ister.
            toplam+=sayi;

        }


         System.out.println("girdiginiz sayilarin toplami:"+ toplam);

    }
}
