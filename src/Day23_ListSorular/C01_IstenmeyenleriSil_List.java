package Day23_ListSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_IstenmeyenleriSil_List {
    public static void main(String[] args) {
        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun




        List<String> isimler = new ArrayList<>(Arrays.asList("Sait","Hasan","Seher", "Seren", "Meltem","Bekir"));
        String istenmeyenHarf = "e";
        System.out.println(istenmeyenElemanSilme(isimler,"e"));


    }

    public static List<String> istenmeyenElemanSilme (List<String> isimler,String istenmeyenHArf ){

        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(istenmeyenHArf)){
                isimler.remove(i); //i=0 oldugunda Seheri getirir, e iceriyorsa siler,
                // loop basa dönünce remove ile cikan seherin yerine seren aldi .--> [Seren,Meltem,bekir,sait,hasan]
                // bu listede i=1 iken Meltemi siler, Seren i atlar, [Seren,Bekir,sait,hasan]
                //bu nedenle i yi döngü boyunca 1 azaltmaliyiz; --> i--; böylece en bastaki
                i--;


            }

        }
        return isimler;




    }







}



