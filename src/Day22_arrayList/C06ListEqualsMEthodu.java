package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06ListEqualsMEthodu {
    public static void main(String[] args) {
        // ayni index'lerdeki tum elementler ayni ise true,
        // ayni olmayan varsa false dondurur


        List<Integer> sayilar1 = new ArrayList<>(Arrays.asList(2,6,9));
        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(6,9,2));

        System.out.println(sayilar1.equals(sayilar2)); // elemanlar esit ancak
        // indexleri ayni degil false yazdirir



        Collections.sort(sayilar1);
        Collections.sort(sayilar2);
        System.out.println(sayilar2.equals(sayilar1)); // true


    }
}
