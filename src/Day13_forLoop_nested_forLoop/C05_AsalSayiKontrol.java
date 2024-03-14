package Day13_forLoop_nested_forLoop;

import java.util.Scanner;

public class C05_AsalSayiKontrol {
    public static void main(String[] args) {
        //  Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bi tam sayi giriniz");
        int sayi = scanner.nextInt();

        // sayi asalsa flag yönetimiyla bulabiliriz. else yaparsak bölünen sayisi kadar asaldegil cikar
        int flag = 20 ;


        for (int i = 2; i < sayi ; i++) {
            if (sayi % i==0){
                System.out.println(" verilen sayi "+ i+ " 'ye bölünüyor, sayi asal degil");
                flag =5;
                break;

            }







        }

            if (flag==20){
                System.out.println(" sayi asal sayidir");
            }








    }
}
