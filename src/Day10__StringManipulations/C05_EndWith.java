package Day10__StringManipulations;

import java.util.Scanner;

public class C05_EndWith {
    public static void main(String[] args) {

 //       kullanicidan bir mail alin
 //       - mail @ icermiyorsa "gecersiz mail"
 //               - mail @gmail.com icermiyorsa, "mail @gmail olmali"
 //               - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
 //       yazdirin.


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        // 3 sart var bagimsiz if cümleleri mi yoksa if else mi ?
        // bagmsiz kullanirsak tüm hatalari yazdirir
        // if-else kullanirsak ilk hatayi yazdirir, kalan calismaz



        if (!mail.contains("@")){ // mail @ icermiyorsa
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")){ // gmail icermiyorsa
            System.out.println("mail g mail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var"); // sanane@gmail.comm

            // @gmail.comm --> gmail.com icerir contains -->true
            // ancak gmail.com ile bitmeli endsWith---> false

        }


    }
}
