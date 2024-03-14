package Day14_MEthodOlusturma;

import java.util.Scanner;

public class C05_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan bir metin alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        // kullanicinin girdigi metni tersten yazdirin

        C03_terstenYazdirma.terstenYazdirma(metin);

        // kullanicinin girdigi metnin palindrome olup olmadigini trueFalse ile yazdir

        System.out.println(C04_Palindrome.isPalindrome(metin));

        // eger girilen metin palindrom ise " aferin sana"
        // palindrome degilse "daha güzel bir metin girmelisin" yazdir

        boolean sonuc= C04_Palindrome.isPalindrome(metin);


        //palindrom olp olmadiigni true veya false dönen method sayesinde kaydettik.

        if (sonuc){ //sonuc== true --> boolean zaten true ya da false verir.
            System.out.println(" aferin Sana");
        }else {
            System.out.println("daha güzel bir metin girmelisin");
        }





    }
}
