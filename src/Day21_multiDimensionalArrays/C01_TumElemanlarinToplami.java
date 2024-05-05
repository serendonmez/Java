package Day21_multiDimensionalArrays;

import java.util.Arrays;

public class C01_TumElemanlarinToplami {
    // icinde array bulunan arrayler ; multidimensional

    public static void main(String[] args) {
        int [][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}; // 7 ye ulasmak icin
        // tek katli bi arr olarak yazacaksak--> [] [] --> inner ve outer array var


        int [][] sayilar={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        // ilk indexteki 4 lementine ulasmak icin ;
        System.out.println(sayilar[0][3]);// 4

        System.out.println(arr [4][1] ); //7


        System.out.println(arr[2][1]); // multi dimensional arr de inner arr direk yazdiramayiz toString ile yazdidirz.
         // !!!!!!! outer array i yazdirmak istersek deepToString (arr)

        // yazdriacak her {} array icin toString methodu kullanilir

        System.out.println(Arrays.toString(sayilar[3])); // [10]

        // outer arrayi yani tüm arrayi yazdirmak istersek -> Arrays.deepToString(sayilar) deriz.


        System.out.println(Arrays.deepToString(sayilar)); // [[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]



    }
}
