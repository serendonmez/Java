package Day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        // Verilen String bir listedeki,
        // kullanilan toplam harf/ karakter sayisini yazdirin




    List<String>isimler = new ArrayList<>(Arrays.asList("Seren","Eqhbal"
            ,"Ilgar","Joanna","Ali Cabbar"));




            int karakterSayisi=0;

       for (int i = 0; i < isimler.size() ; i++) {
                   karakterSayisi+= isimler.get(i).length();
       }   System.out.println(karakterSayisi);




    }
}
