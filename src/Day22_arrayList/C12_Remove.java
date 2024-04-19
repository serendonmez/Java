package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_Remove {
    public static void main(String[] args) {

        // remove :istenen objeyi siler ver boolean sonuc verir.

        List<String> dugunList= new ArrayList<>(Arrays.asList("Seren","Ilgar","Meltem","Ali"));

        System.out.println(dugunList.remove("Seren")); // [Ilgar, Meltem, Ali]

        System.out.println(dugunList.remove(1));

        System.out.println(dugunList.remove("Seren")); // false ; zaten silmistik ,

        // Array list eger integer degerlerden olusuyorsa remove methodu silinecek sayiyi
        // index olarak alir;
        // bu yüzden silinecek sayiya yeni varable atamak gerekir

        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,6,8,4));

        System.out.println(list.remove(1));

        Integer silinecekSayi =6;

        System.out.println(list.remove(silinecekSayi)); // true




    }
}
