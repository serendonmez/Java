package Day30passByValue_cokluElement;

import java.util.ArrayList;
import java.util.List;

public class C04Mutable_ImmutableClasslar {
    public static void main(String[] args) {

        String str = "java candir";


        str.toUpperCase();
        System.out.println(str); // Java candir


        str.replace("a", "c");
        str.length();
        System.out.println(str); // Java candir ; atama yapilmadigi sürece ilk str degeri yazdirir.

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(4);
        sayilar.add(7);

        System.out.println(sayilar); // [4, 7]

        sayilar.add(1, 9);

        System.out.println(sayilar); // [4, 9, 7]

        sayilar.remove(0);

        System.out.println(sayilar); // [9, 7]




    }
}
