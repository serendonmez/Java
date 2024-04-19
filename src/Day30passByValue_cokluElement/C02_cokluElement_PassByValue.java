package Day30passByValue_cokluElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_cokluElement_PassByValue {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,5,7,1)); // [3, 5, 7, 1]
         // output= [6, 8, 10, 4]

        // listededeki elementleri 3 artirip listenin yeni halini yazdiran
        // bir method olusturun

        elementleriArtir(sayilar); // method'da [6, 8, 10, 4] yazdirir

        System.out.println(sayilar); // main de [6, 8, 10, 4] yazdirir



        // 5 elemanli yeni bir liste olusturup
        // sayilar list'ine atayip
        // sayilar listinin son halini yazdiran bir method olusturun

        yeniListeOlustur(sayilar);


        System.out.println(sayilar);


    }


    public static void elementleriArtir (List<Integer> sayilar) {

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i)+3); // i=0 iken 6+3


        }
        System.out.println(sayilar);




    }

    public static void yeniListeOlustur (List<Integer> sayilar){


        List<Integer> yeniList = new ArrayList<>(Arrays.asList(0,0,0,0,0));


        sayilar=yeniList; // method ta sayilar listesinin kendisine atama yapiliyorsa
        // atamayi yeni atama olarak algilamaz
        System.out.println( "sayilar listesinin son hali : "+ sayilar);




    }







}
