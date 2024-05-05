package Day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Split {
    public static void main(String[] args) {

        String str= "Ali topu at, at Ali at" ;


        System.out.println(Arrays.toString(str.split("at"))); //[ Ali topu , , ,  Ali ]

        // split etmek istedigimiz ( bölmek istedimiz) yerleri isaretler
        // isaretlediklerini yok eder, geri kalanlari eleman olarak bir arraye verir.

        System.out.println(Arrays.toString(str.split("Ali"))); //[ ,  topu at, at ,  at]

        // str dakikelime sayisini yazdir
        // " " ile split yapalim

        System.out.println(Arrays.toString(str.split(" "))); //[Ali, topu, at,, at, Ali, at]

        System.out.println("kelime sayisi : "+str.split(" ").length); // str.split " " un length i
        // bize kelime sayisini verir

        // str i karakterlerine split edelim

        System.out.println(Arrays.toString(str.split("")));//


    }
}
