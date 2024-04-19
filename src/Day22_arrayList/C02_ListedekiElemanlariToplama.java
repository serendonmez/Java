package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListedekiElemanlariToplama {
    public static void main(String[] args) {
        // verilen int bir listedeki tüm elelmanlari topla sonucu yazdir.


        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));

        int toplam =0;

        for (int i = 0; i < list.size() ; i++) {
            toplam+=list.get(i);

        }
        System.out.println(toplam);
    }
}
