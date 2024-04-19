package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_ListGetMethodu {
    public static void main(String[] args) {
        // list ten istedigimiz index deki elemente ulasmak--> get


        List<Integer> list = new ArrayList<>(Arrays.asList(1,7,9,752,39));
        System.out.println(list);

        System.out.println(list.get(4));
        // get methodu istenilen index teki elementi verir.
        list.add(4,78);
        System.out.println(list);

        System.out.println(list.get(4));



    }
}
