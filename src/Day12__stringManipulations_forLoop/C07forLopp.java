package Day12__stringManipulations_forLoop;

import java.util.Scanner;

public class C07forLopp {
    public static void main(String[] args) {
        // Kullanicidan baslangic bitis degerlerini alip
        // sinirlar dahil olarak
        //baslangictan bitise kadar 7 ile bolunebilen sayilari yazdirin
        // bitis degeri baslangictan kucuk ise hata mesaji yazdirin



        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degerini giriniz: ");
        int baslangicDegeri= scanner.nextInt();
        System.out.println(" bitis degerini giriniz : ");
        int bitisDegeri= scanner.nextInt();



        if (bitisDegeri<baslangicDegeri){
            System.out.println("Error");
        } else if (baslangicDegeri<bitisDegeri) {
            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
                if (i%7== 0){
                    System.out.print( i+" ");
                }

            }

        }


        //      int baslagicDegeri= scanner.nextInt();
 //      int bitisDegeri= scanner.nextInt();
 //      if (bitisDegeri<baslagicDegeri){
 //          System.out.println("Bitis degeri baslangictan kücük olamaz.");
 //      }else {
 //      for (int i = baslagicDegeri ; i <= bitisDegeri;i++) {
 //          System.out.println();}
 //      }

    }
}
