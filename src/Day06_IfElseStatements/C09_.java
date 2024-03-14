package Day06_IfElseStatements;

import java.util.Scanner;

public class C09_ {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        //  yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println(" lütfen yasinizi giriniz: ");

        double yas = scanner.nextDouble();
        if (yas >= 65) {
            System.out.println("Emekliolabilirisniz");


        } else {
            System.out.println("emekli olmak icin " + (65-yas) + "yil daha calismalisin");
        }
    }
}
