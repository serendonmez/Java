package Day16_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {


        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlari toplanacak pozitif tamsayiyi giriniz...");
        int sayi = scanner.nextInt();

        // 172104

        int enSondakiRakam = 0;
        int rakamlarToplami = 0;
        int verilenSayi = sayi;

        while (verilenSayi > 0){

            enSondakiRakam = verilenSayi % 10;
            rakamlarToplami += enSondakiRakam;
            verilenSayi /= 10;
        }

        System.out.println("Verilen "+sayi + " sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}


//public static void (String metin){


