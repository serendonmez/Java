package Day16_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
        //Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        // bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);


        int sayi=0;
        int sayiToplami=0;
        int sayiAdedi= 0;


        while(sayi!=0){
            System.out.println("Lütfen toßplanmak üzere pozitif sayi girin."+
                    "\nBitirmek icin 0'a basin");
            sayi= scanner.nextInt();

        }






    }
}
