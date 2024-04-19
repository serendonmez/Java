package Day20_arrays_multiDimensionalArrays;

import Day19_Arrays.C05_ElemanArama;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        // binary --> unary binary trilogy...
       // --> ikili  search bölerek arama
        // aranilan elemani arrayde ikiye bölerek ariyor
        // Bei einer linearen Suche wird jedes Element in der Liste nacheinander überprüft,
        // bis das gesuchte Element gefunden wird.
        // Dies kann bei großen Listen sehr zeitaufwändig sein,
        // da im schlimmsten Fall jedes Element überprüft werden muss.

        int [] arr= {3,4,5,2,7,0,46};


        C05_ElemanArama.elemanArama(arr,3);


        C05_ElemanArama.elemanArama(arr,11);
        // bu method Stringler icin kullanilamaz; parametre olarak int deger aliyor

        // java da bir array de aranan bir elemanin varligini sorgulamak icin
        // Arrays.binarySearch() kullanilir


        System.out.println(Arrays.binarySearch(arr, 7)); // -7

        System.out.println(Arrays.binarySearch(arr, 4)); //-7

        System.out.println(Arrays.binarySearch(arr, 9)); //-7

        // binarySearch(), aranan elementin, array'de ilk kullanildigi index'i verir
        // AMA binarySearch() sort edilmis array'lerde saglikli calisir
        // sort edilmemis array'lerde sonuc ONGORULEMEZ

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 2, 3, 4, 5, 7, 46]

        System.out.println(Arrays.binarySearch(arr, 7)); // 5

        System.out.println(Arrays.binarySearch(arr, 4)); //3

        System.out.println(Arrays.binarySearch(arr, 9)); //-7
        System.out.println();



        // olmayan bir degeri soruarsak her zaman - yazdirir,
        // konum ollarak da sort edilmis bir arrayde binarySearch (arr,aranilanElaman)
        // yapilmissa siralamadaki konum nerde olmasi gerekiyorsa onun length inin eksi halini verir.
        // indexini degil

        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr, 0)); // 0
        System.out.println(Arrays.binarySearch(arr, 7)); // 5
        System.out.println(Arrays.binarySearch(arr, 46)); // 6
        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        System.out.println();

        System.out.println(Arrays.binarySearch(arr, -15)); // -1
        System.out.println(Arrays.binarySearch(arr, 90)); // -8
        System.out.println(Arrays.binarySearch(arr, 10)); // -7
        System.out.println(Arrays.binarySearch(arr, 20)); // -7

        System.out.println("SORU");



        // what is the result of the following?

        int [] random= {6,-4, 12, 0,-10};
        int x= 12;
        int y= Arrays.binarySearch(random,x);
        System.out.println(y);

        // Answer : The Result is undefined.
        // kesin sonuc icin sort yapilip daha sonra binarySearch edilmeli

        Arrays.sort(random);
        System.out.println(Arrays.toString(random)); //[-10, -4, 0, 6, 12]
        System.out.println(Arrays.binarySearch(random, x)); // siralama yaptiktan sonra 4. index te oldugunu verir.


    }
}
