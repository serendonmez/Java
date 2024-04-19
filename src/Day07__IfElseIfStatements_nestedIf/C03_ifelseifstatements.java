package Day07__IfElseIfStatements_nestedIf;

import java.util.Scanner;

public class C03_ifelseifstatements {
    public static void main(String[] args) {


        // Kullanicidan bir tamsayi isteyin
// sayi 7 ile bolunuyorsa "7'nin kati",
// sayi 5 ile bolunuyorsa "5'in kati"
// her ikisine de bolunuyorsa "Super sayi"
// ikisine de bolunemiyorsa "Kotu sayi" yazdirin

        // verilen görev siralamasindan bagimsiz en cok kisitlama iceren sart en basa yazilir.!!!!!


        Scanner scan = new Scanner(System.in) ;
        System.out.println( " Lütfen potizif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();


        if (girilenSayi % 7 ==0 && girilenSayi % 5 ==0){
            System.out.println("super sayi"); }
        else if (girilenSayi % 7==0 ){
            System.out.println(" 7 nin kati");}
        else if (girilenSayi % 5 == 0){
            System.out.println("  5 in kati"); }
        else System.out.println("kötü sayi");

        }


        //
        //
        //if (girilenSayi % 7 == 0 ) {
      //
        //
        //   /System.out.println( " 7 nin kati");} else if (girilenSayi % 5 == 0 ) {
      //
        //
        //   /System.out.println( " ");
      //
      //
        //
        //}

    }

