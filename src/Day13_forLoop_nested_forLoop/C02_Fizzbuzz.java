package Day13_forLoop_nested_forLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_Fizzbuzz {
    public static void main(String[] args) {


       /* Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak o sayiyya kadar tum tamsayilari
       yazdirin, sira -3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin*/

        Scanner scann = new Scanner(System.in);
        System.out.println("14 ten kücük pozitif tamsayi girin : ");
        int sayi = scann.nextInt();




        for (int i = 1; i <= sayi; i++) {
            if (i%3==0 && i %5== 0 ){
                System.out.println(" fizzBuzz ");

            } else if (i%5 ==0) {
                System.out.print(" buzz ");

            }else if (i %3 ==0) {
                System.out.print(" fizz ");
            }else {
                System.out.print(i+ " ");
            }

        }































 //       int faktoryel = 1;
//
 //       for (int i = sayi; i >= 1; i--) {
 //           if (i% 3==0 && i% 15 ==0){
 //               System.out.println("fizzbuzz");
 //           }else if (i%3 ==0 ) {
 //               System.out.print("fizz");
 //           } else if (i %5 ==0) {
 //               System.out.println("buzz");
//
 //           }else {
 //               System.out.println(i + " ");
 //           }
 //           }




        }








    }

