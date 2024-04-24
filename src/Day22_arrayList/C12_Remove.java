package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_Remove {
    public static void main(String[] args) {

        // remove :istenen objeyi siler ver boolean sonuc verir.

        List<String> a= new ArrayList<>(Arrays.asList("seren","Ilgar","Meltem","Ali"));

        System.out.println(a.remove("seren")); // [Ilgar, Meltem, Ali]

        System.out.println(a.remove(1));

        System.out.println(a.remove("seren")); // false ; zaten silmistik ,



        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,6,8,4));

        System.out.println(list.remove(1));

        Integer silinecekSayi =6;

        System.out.println(list.remove(silinecekSayi)); // true




    }
}
