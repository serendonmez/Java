package Day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C07OrtakElemanlar {
    public static void main(String[] args) {

        //soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] array1 = {3, 6, 8, 1, 0, 3, 8, 1, 1}; // ortak lelemanlar 3,6,1
        int[] array2 = {3, 6, 7, 5, 6, 5, 6, 5, 1};  //7,8,5,0


        List<Integer> ortakElemanlarListesi = new ArrayList<>();


        // bir array'deki tum elemanlari,
        // diger array'deki tum elemanlarla karsilastirmak icin
        // nested loop kullanmak zorundayiz


        for (int each1 : array1) {
            for (int each2 : array2) {
                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)) {
                    ortakElemanlarListesi.add(each1);

                }

            }


        }
        System.out.println(ortakElemanlarListesi);
    }
}
