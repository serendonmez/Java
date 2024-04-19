package Day22_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListMethodlari {
    public static void main(String[] args) {


        ArrayList<Integer> sayilar = new ArrayList<>(); // = List<Intiger> sayilar= newArrayList<>();




        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);//[ 10,7,9]

        List<Integer>list= new ArrayList<>(Arrays.asList(3,6,8));

        //asList tek satirda birden fazla eleman girme
        //add in coklu hali



        System.out.println(list); // [3,6,8]


        sayilar.add(1,5);
        System.out.println(sayilar); // add (ind, element) --> girilen indexe girilen elementi ekler
                                            /// oindexteki elementi silmeden

        //[3,5,6,8]
        sayilar.add(3);
        System.out.println(sayilar);//
        sayilar.add(4);
        System.out.println(sayilar); // add ( int e ) ; son indexe lement ekliyor

        System.out.println(sayilar.addAll(list)); // true döndü ?


        System.out.println(sayilar);
        System.out.println(sayilar.addAll(2, list)); // true verdi.
        System.out.println(sayilar);


    }
}
