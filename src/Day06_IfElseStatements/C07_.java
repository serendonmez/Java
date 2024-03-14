package Day06_IfElseStatements;

import java.util.Scanner;

public class C07_ {
    public static void main(String[] args) {

        // kullanıcıdan notunu isteyin
        // kullanıcı 0 ile 100 arasında olmayan bir not girerse "geçersiz not" yazdırın
        // 0 ile 100 arasında (sınırlar dahil) gecerli not yazdırın



        Scanner scanner = new Scanner( System.in) ;
        System.out.println(" lütfen notunuzu giriniz ");
         double not = scanner.nextDouble();
         if (not <0 && not>100){
             System.out.println(" gecersiz");
         } else if (not >=0 || not<=100) {
             System.out.println(" gecerli");

         }


    }
}
