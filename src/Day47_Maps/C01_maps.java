package Day47_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_maps {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>(Arrays.asList(3,8,5,9,3,5,47,3,5,5,3,3));



        // 3 ün kac kere kullanildigini bulun



    }

    public static void istenenSayiAdediYazdir(int istenenSayi, List<Integer> sayilar){

        int ucAdedi=0;

        for ( int each
                 :  sayilar ) {
           if (each == istenenSayi){
               ucAdedi++;
           }
        }
        System.out.println(ucAdedi);



    }
}
