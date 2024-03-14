package Day06_IfElseStatements;

import java.util.Scanner;

public class C06_ {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin
        // girilen harf kucuk harf ise "Kucuk"
        // buyuk harf ise "buyuk" yazdirin


      Scanner scanner = new Scanner(System.in);
      System.out.println("Lütfen bir harf giriniz");
      char harf = scanner.next().charAt(0);
      if (Character.isLowerCase(harf)) {  // veiriken toUpperCase durum öyleyse isUpperCase
          System.out.println("Kucuk");
      }
      if (Character.isUpperCase(harf)){
          System.out.println("Buyuk");
      }




        System.out.println(" -----------------------------------------");
      scanner.nextLine();



        System.out.println( " lütfen bir harf giriniz:");

        char harf1= scanner.next().charAt(0);
        if (harf1 >='a' && harf1 <= 'z'){
            System.out.println("kücük");

        }
        if (harf1 >='A' && harf1 <='Z'){
            System.out.println("büyük");
        }







    }
}
