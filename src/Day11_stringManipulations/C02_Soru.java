package Day11_stringManipulations;

import java.util.Scanner;

public class C02_Soru {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve aradigi metin parcasini isteyin
        // cumle ve metnin durumuna gore, asagidaki durumlardan uygun olani yazdirin
        // 1- aradiginiz metin cumlede yok
        // 2- aradiginiz metin cumlede sadece 1 kere kullanilmis
        // 3- aradiginiz metin cumlede 1'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.print(" bir metin girin ");
        String metin = scanner.nextLine();
        System.out.println(" aradiginiz metin parcasini girin ");
        String aranilanMetin = scanner.nextLine();

       int ilkIndex =metin.indexOf(aranilanMetin);
       int lastIndex= metin.lastIndexOf(metin);


       if (ilkIndex==-1) { // ilkindex  -1 = metinde aranilanmetin yoktur.
           System.out.println("aranilan metin  cümleden yok");
       } else if (ilkIndex==lastIndex) {
           System.out.println("aranilan metin cümlede sadece bi kere kullanilmis"); // else if i calismiyor

       }else {
           System.out.println(" aradiginiz metin metinde birden fazla kullanilmis");
       }


    }
}
