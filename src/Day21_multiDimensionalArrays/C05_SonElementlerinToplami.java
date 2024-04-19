package Day21_multiDimensionalArrays;

import java.util.Arrays;

public class C05_SonElementlerinToplami {
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli bir array’de
        //        her bir inner array’in son elementlerinin toplaminini
        //        yazdiran bir method olusturun.

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}}; //6+9+1+4


        sonElementleritopla(arr);


    }


    public static void sonElementleritopla (int[][]arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];

        }
        System.out.println(toplam);



    }
}
