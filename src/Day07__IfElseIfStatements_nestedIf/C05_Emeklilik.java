package Day07__IfElseIfStatements_nestedIf;

import java.util.Scanner;

public class C05_Emeklilik {
    public static void main(String[] args) {
       // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println( " lütfen cinsiyetinizi giriniz : K : Kadin, E : Erkek ");
        char cinsiyet= scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinzi girin");
        double yas = scanner.nextDouble();



        if (yas<10 || yas>120) {
            System.out.println("gecersiz yas");
        } else if (cinsiyet=='K'&& yas >=60){
            System.out.println("emekli olabilrisin");
        } else if (cinsiyet == 'E' && yas>=65) {
            System.out.println(" emekli olabilrisin");
        }else if (cinsiyet=='K'&& yas<60){
            System.out.println("Emekli olmak icin "+ (60-yas)+" yil daha calismalisiniz");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("emekli olmak icin "+(65-yas)+" yil daha calismalisiniz");

        }else{
            System.out.println(" Girilen bilgiler yanlis");}




    }
}
