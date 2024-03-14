package Day12_;

import java.util.Scanner;

public class C06forLoop {
    public static void main(String[] args) {
        // bir kronometre yapin
        // kullanicidan aldiginiz pozitif sayidan
        // 1'e kadar tum sayilari yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();





        //0 1 2 3 4 5 6 7 8 9 10..... +n=
        for (int i = sayi; i > 0; i--) {// büyükten kücüge gittigimiz icin
            System.out.print(i+" ");

        }


    }
}
