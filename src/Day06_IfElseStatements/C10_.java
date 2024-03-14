package Day06_IfElseStatements;

import java.util.Scanner;

public class C10_ {
    public static void main(String[] args) {
         //Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner= new Scanner(System.in );
        System.out.println( " Lütfen bir harf giriniz");
        char harf =scanner.next().charAt(0);
        if (Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));
        }else System.out.println(harf);























  //      char harf = scanner.nextLine().charAt(0);
  //      if (Character.isLowerCase(harf) ){
  //          System.out.println(Character.toUpperCase(harf));
  //      } else {
  //          System.out.println(harf);
  //      }



        char harf1 = scanner.next().charAt(0);
     //   if ()
    }
}
