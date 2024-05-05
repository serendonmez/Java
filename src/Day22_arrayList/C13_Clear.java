package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C13_Clear {
    public static void main(String[] args) {

        // clear methodu tüm listesi temizler




        ArrayList<Character> partyList = new ArrayList<>(Arrays.asList('a','b',' '));
        System.out.println(partyList);
        partyList.clear();
        System.out.println(partyList);


        // RemoveAll Methodu : silinecek list

        ArrayList<Character> clist= new ArrayList<>(Arrays.asList('s','M','e','w'));

        // removeAll methodunda silinecek elementler yeni bir ArrayListe atanir
        // daha sonra metrhod kullanilir.

        List<Character> silinecekList = new ArrayList<>(Arrays.asList('s','w'));

        System.out.println("ERRRRRRRRRRRRRRR");
        System.out.println(clist.removeAll(silinecekList)); // true

        System.out.println(clist); // [M,e]


    }
}
