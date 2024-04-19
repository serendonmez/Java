package Day11_stringManipulations;

import java.util.Scanner;

public class C05_Replace {
    public static void main(String[] args) {
        String str= "Java candir";

        System.out.println(str.replace('a', 'A')); // JAvA cAndir.
        System.out.println(str.replace("candir", "guzeldir")); // Java guzeldir.



        // a lari yok edin

        str.replace("a",""); /// Jv cndir

        // bleri B yap.

        System.out.println(str.replace('b', 'B')); // Java candir.

        System.out.println(str.replace("Can", "Handir"));// Java candir. buyuk C yok // case sensitiv


        // sadece ilk a yi A yapin
        System.out.println(str.replaceFirst("a", "A")); // JAva candir

        // Kulllanicidan bir metin isteyin
        // ve metinde varsa ilk rakami * yapin

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle =scanner.nextLine();

        System.out.println(cumle.replaceFirst("\\d", "*")); //replaceFirst ilk a yi replace eder.

      //  Regex (Regular Expressions)
      //      \\s : space   \\S : space olmayan hersey
      //      \\s+ : yanyana birden fazla space
      //      \\d : digits \\D : digit olmayan hersey
       //     \\w : harf, rakam veya _ \\W : harf, rakam veya _ olmayan hersey







    }
}
