package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class C14_ListEquals_IndexOf_Sort {
    public static void main(String[] args) {

        // Equals --> iki listin esit olduugnu kontrol etmek icin kullnailir


        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(14,78,963,15,-14));


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(78,14,-14,963,15));


        System.out.println(list1.equals(list2)); // false --> önce sort etmedik.

        // collections.sort methodu listi siralar, natural number a göre
        // ASCII de büyük sayilar önce kücükler sonra





        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));


        // index Of --> aranan index

        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(14,852,98,3,68,14,78,85,951,47));

        System.out.println(sayilar.indexOf(852));

        // LastindexOf

        System.out.println(sayilar.lastIndexOf(14));




    }
}
