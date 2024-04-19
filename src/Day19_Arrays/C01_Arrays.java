package Day19_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int [] arr = new int [4]; // [0, 0, 0, 0]


        System.out.println("aaaaaaa");

        System.out.println(arr[0]); //0

        // arr yin 2. indexindeki elementi yazdirin.

        System.out.println(arr[2]); // 0

        // Arr in 1. indexin deger olarak 5 atayin

        arr [1]=5; // 0, 5, 0 ,0

        // tüm arr i yazdir

        System.out.println(Arrays.toString(arr));  // arr non primitiv direk yazdiramayiz.


        // Arrays.toString( arr).sout

        System.out.println(arr);  // [I@2752f6e2

        System.out.println(Arrays.toString(arr));// [0,5,0,0] --> köseli parantez bunun bir arry oldugunu gösterir.

        // bir array'de kac eleman oldugunu (length) yazdirin

        System.out.println(arr.length); // length eleman sayisini verir,

        // array'deki tum elemanlari yanlarinda bir bosluk birakarak yazdirin
        // String arr=[0, 0, 2, 3]
        // 0 0 2 3 --> elemanlarini yazdirmak


        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }




    }
}
