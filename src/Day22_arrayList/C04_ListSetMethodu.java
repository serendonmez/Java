package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ListSetMethodu {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,7,1));
        System.out.println(sayilar);

        sayilar.add(2,9);// [3,4,9,7,1,9]
        System.out.println(sayilar);


        // update yapar

        sayilar.set(3,5);
        System.out.println(sayilar); // [3,4,9,5,1,]




    }
}
