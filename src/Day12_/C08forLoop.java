package Day12_;

import java.util.Scanner;

public class C08forLoop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degerlerini alip
    // sinirlar dahil olarak
    // aralarindaki 9 ile bolunebilen sayilari yazdirin
    // bitis degeri baslangictan kucuk olsa da kod calismalidir




        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degerini giriniz: ");
        int baslagicDegeri= scanner.nextInt();

        System.out.println(" bitis degerini giriniz : ");
        int bitisDegeri= scanner.nextInt();




         if (baslagicDegeri<bitisDegeri) {
             for (int i = baslagicDegeri; i <= bitisDegeri; i++) {// 0-1-2-3----36 = 9-18-27-36
                 if (i % 9 == 0) {
                     System.out.print(i + " ");


                 }
             }


         }else {
             for (int i = baslagicDegeri; i >= bitisDegeri ; i--) { // 81-80-79-78---= 81-72-67-56
                 if (i%9==0){
                     System.out.print(i+" ");
                 }
             }

         }
    }
}
