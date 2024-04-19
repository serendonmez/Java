package Day20_arrays_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Sort {
    public static void main(String[] args) {


        int[] sayilar ={3,5,7,19,9,0,1,4};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); //[0, 1, 3, 4, 5, 7, 9, 19]


        String[] isimler = {"Mehmet","Mahmut","Mustafa","Mansur","melik","MEMET"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));


        // sort method yazdirmaz , sonradan yazilmasi gerekir ya da atanmasi




        // ASCII table da siralama olarak büyük harfler daha önce geliyor.
        // yani degeri kücük ,
        // büyük harfler < kücük harfler (ASCII table da)

        // siralama da sirayla ilk harfler ayni olunca 2. harfler degerlendirilyior
         //




    }
}
