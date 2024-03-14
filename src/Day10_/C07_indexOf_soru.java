package Day10_;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_indexOf_soru {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        // indexOf() parametre olarak hem String hem de char kabul eder
        System.out.println(str.indexOf("t")); // 4
        System.out.println(str.indexOf('t')); // 4

        System.out.println(str.indexOf("Ali")); // 0

        System.out.println(str.indexOf("pu at")); // 6

        System.out.println(str.indexOf(' ')); // 3

        System.out.println(str.indexOf("t", 7)); // 10
        // 7.index ve sonrasindaki ilk t'nin index'ini verir
        // "u at, at Ali at"




        // metindeki 2. a nin indexi

        int aNinilkIndexi =str.indexOf("a");
        System.out.println(str.indexOf("a", aNinilkIndexi + 1)); //.. indexten itibaren aratmak//3




        //Kullanicidan bir metin isteyin
        //metindeki 2 . a nin indexini yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();
        System.out.println(metin.toLowerCase());


        int ilkIndex=metin.indexOf("a");

        System.out.println(metin.indexOf("a",ilkIndex+1)); // büyk harfli metinde calismiyor???


    }


}
