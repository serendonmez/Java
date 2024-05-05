package Day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArraysEquals {
    public static void main(String[] args) {


        int arr1 [] = {2,1,7,6};
        int arr2 []= {7,1,6,2};

        System.out.println(Arrays.equals(arr1,arr2)); // esit mi ; false
        // elemanlar ayni konumlar farkliysa false verir.

        int arr3 []= { 3,2,7,8,11};
        int arr4 []= {7,3,8,2,12};

        Arrays.sort(arr3); // {2,3,7,8,11}
        Arrays.sort(arr4); // {2,3,7,8,12}

        System.out.println(Arrays.equals(arr3,arr4)); // false

        int arr5 [] = {4,2,6,8,11};
        int arr6 [] ={11,4,8,2,6};
        Arrays.sort(arr5);//{ 2,4,6,8,11}
        Arrays.sort(arr6); // { 2,4,6,8,11}
        System.out.println(Arrays.equals(arr5,arr6)); //true


    }
}
