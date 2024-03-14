package Day16_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {



        System.out.println(metniTersCevir("ich habe nur Bahnhof verstanden "));


    }





    public static String metniTersCevir(String metin){
        // Ali topu tut

        int index = metin.length()-1; //
        String tersMetin= "";




        while ( index>=0){
            tersMetin +=metin.charAt(index);
            index--;
        }
        return tersMetin; // requirement :metni terse ceviren bi codu döndür.
        // bu yüzden yazdirmayip return yapmamiz yeterli , ancak yazdirip  deneriz
    }











}












