package Day04_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_DataCasting {

    public static void main(String[] args) {


        // soru : int olarak verilen 3 degerin ort, double olarak yazdir.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 tamsayi giriniz. "); // tek inputla 3 data alabiliriz
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();




        System.out.println( " girilen sayilarin ortalmasi: " + (double)( sayi1+ sayi2 + sayi3 )/3);



    }
}
