package Day15_MethodOverloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak üzere tam sayilar isteyin
        // sayilarin toplami 500 veya daha fazla olursa
        // sayi istemyi durdurup toplami yazdirin.


        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam =0;


        while (toplam <500) {

            System.out.println(" toplanmak üzere tam sayi giriniz");
            sayi = scanner.nextInt();
            toplam+=sayi;

            System.out.println(" sayi :" + sayi + " Toplami : "+ toplam);
            sayi++;

        }


        // System.out.println("girdiginiz sayilarin toplami:"+ toplam);




        // 1 den 5e kadar sayilari alt alta yazdir
        Scanner scann = new Scanner(System.in);

        int sayilar=0;

        while (sayilar<=10){

            System.out.println(sayilar);
            sayilar++;

        }






    }
}
