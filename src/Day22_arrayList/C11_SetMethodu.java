package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_SetMethodu {
    public static void main(String[] args) {
        // set methodu istenen elementi update etme

        ArrayList<String> list= new ArrayList<>(Arrays.asList("Meltem","ILgar","Ahmet","ali"));

        System.out.println(list);

        System.out.println(list.set(2, "Ayse"));

        System.out.println(list);




    }
}
