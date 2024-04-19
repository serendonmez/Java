package Day21_multiDimensionalArrays;

import java.sql.Array;
import java.util.Arrays;

public class C06_AyniIndextekilerinToplami {
    public static void main(String[] args) {

        // verilen 2 katli , 2 elemanli bir multidimensional array'de
        //ayni index'e sahip elementleri toplayip,
        //yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        //input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};----->
        //output:                       [5, 7, 11]


        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        int yeniArrlength= arr[0].length<arr[1].length? arr[0].length:arr[1].length;


        int[] yeniArr= new int[yeniArrlength]; // [0,0,0] 1-> 0,0 +1, / 0,1 +1,1 /0,2+1,2

        for (int i = 0; i <yeniArrlength ; i++) {

                yeniArr[i]=arr[0][i]+arr[1][i];

            }
        System.out.println(Arrays.toString(yeniArr));

        }









    }




