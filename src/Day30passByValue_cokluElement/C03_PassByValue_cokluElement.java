package Day30passByValue_cokluElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class C03_PassByValue_cokluElement {
    public static void main(String[] args) {

        // arr'in tum elementlerini bir azaltip yazdiran bir method olusturun

        int[] arr = {6, 9, 2};
        elemanlariAzalt(arr); // 5, 8 ,1
        // method call dan sonra Arr i yazdiralim
        System.out.println(Arrays.toString(arr)); // 5,8,1


        // yeni bir method olusturun
        // method'da uzunlugu 4 olan yeni bir array olusturup
        //    arr'deki elemanlari yeni array'e tasiyin
        // 4. eleman olarak 3 atayin
        // islem bittikten sonra, yeni array'i arr'ye atayip yazdirin

        elemanEkleme(arr);


    }


    public static void elemanlariAzalt (int [] arr){ // 5,8,1



        for (int i = 0; i < arr.length; i++) {

            arr[i]-=1; // 5,8,1


        }


        System.out.println(Arrays.toString(arr));



    }


    public static void elemanEkleme (int [] arr){

        int [] yeniArr = new int[4]; // 0,0,0,0


        for (int i = 0; i <arr.length ; i++) {

            yeniArr[i]=arr[i];


        }
        yeniArr[3]=3;
        yeniArr=arr;

        System.out.println(Arrays.toString(yeniArr)); // neden arr i yazdirdik yeniarr i degil


    }



}