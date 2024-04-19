package Day21_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_ArrayList {
    public static void main(String[] args) {

        // Array lists  dinamik ve yeniden boyutlandirilabilir bir  arraydir.

         // yani esnek





        // Kullanicidan girmek istedigi kadar isim alip
        // girilen isimleri kaydedin
        // Kullanici bitirmek icin q'ya basmalidir

        List<String> isimler = new ArrayList<>();

            ArrayList<String>deneme= new ArrayList<>();
            ArrayList<String> deneme1= new ArrayList<String>();






        // Kullanicidan girmek istedigi kadar isim alip
        // girilen isimleri kaydedin
        //Kaullanici bitirmek icin q 'a basmali

        Scanner scanner = new Scanner(System.in);
        String isim = "";




        // kac kere döngü olacagina kullanici karar verdigi icin while loop yapariz
        while (! isim.equalsIgnoreCase("q")){
            System.out.println("listeye eklemek icin isim girin"+ isim+"\nbitirmek icin q ya basin");

        isim=scanner.nextLine();

        if (! isim.equalsIgnoreCase("q")){
            isimler.add(isim);
        }

        }
        System.out.println("girilen isimler "+ isimler);





    }
}
