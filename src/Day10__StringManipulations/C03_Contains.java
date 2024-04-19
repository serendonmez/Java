package Day10__StringManipulations;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        // Kullanicidan bir metin isteyin
        //// metin "ev" iceriyorsa "Home sweet home",
        //// "is" iceriyorsa "calismak cok guzel"
        //// ikisini de iceriyorsa "hayatta denge cok guzeldir",
        //// ikisini de icermiyorsa "tembellik guzel degil" yazdiralim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz..");
        String metin = scanner.nextLine();


        if (metin.contains("ev") && metin.contains("is")) { // en genis sart en üste
            System.out.println("hayatta denge cok guzeldir");}// evden calismak güzel -->true
         else if (metin.contains("ev")){
            System.out.println("Home sweet home");}
         else if (metin.contains("is")) {
            System.out.println("calismak cok guzel");} // isleyis -->true
         else {
            System.out.println("tembellik guzel degil");}
    }
}
