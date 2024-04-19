package Day23_ListSorular;

import java.util.ArrayList;
import java.util.List;

        public class C03_PozitifTamBolenlerListesi {
        public static void main(String[] args) {
        //Soru 6- Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        //        input : 20  return list : {1,2,4,5,10,20}

            System.out.println(bolenler(56));


        }

    public static List<Integer> bolenler (int tamSayi) {

        List<Integer> bolenler = new ArrayList<>();


        for (int i = 1; i <= tamSayi; i++) {

            if (tamSayi % i == 0) {

                bolenler.add(i);

            }

        }

    return bolenler;
    }
}
