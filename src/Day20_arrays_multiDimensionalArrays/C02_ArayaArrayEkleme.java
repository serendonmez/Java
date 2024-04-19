package Day20_arrays_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_ArayaArrayEkleme {
    public static void main(String[] args) {
        // verilen int bir array e istenen elemani ekleyip
        //array in son halini döndüren bir method olusturun (döndürün=Return)

        int arr[]={3,5,7};
        int eklenecekSayi= 9;

        arr= arrEkleme(arr, 9); // method sadece döndüruyor kendimiz yazdiracagiz

        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrEkleme(int [] arr, int eklenecekEleman){


            // var olan arr ye normalde eleman eklenmez
        // ama array e toptan yeni bir array degeri atayabiliriz.

        int[] yeniarr = new int[arr.length+1]; // [0,0,0,0]

        // eski array deki elemanlari ayni indexlerle yeni arr e atayalim.

        for (int i = 0; i < arr.length ; i++) {

            yeniarr [i]= arr[i]; // yeniarr []= {3,5,7,0}
            // yeniarr[yeniarr.length-1]= eklenecekElemani;

            yeniarr[yeniarr.length-1]=eklenecekEleman;// yeniarr.length-1 =son karakterin indexi
                        // yeniarr[3] = eklenecekElamani atiyoruz.







        }



        return yeniarr;


    }



}
