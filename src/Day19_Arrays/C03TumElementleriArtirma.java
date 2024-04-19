package Day19_Arrays;

import java.util.Arrays;

public class C03TumElementleriArtirma {
    public static void main(String[] args) {


        //- Verilen bir int array’in tum elemanlarini 2 artirip --> girilen deger kadar artirma
        // bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr = {4,7,2};
   //    arr=tumelemanlariArtirma(arr);

   //     System.out.println(Arrays.toString(arr));

        arr=tumelemanlariArtirma(arr,9);

        System.out.println(Arrays.toString(arr)); // [13, 16, 11]


    }





public static int[] tumelemanlariArtirma (int[]arr, int artisMiktari){

    for (int i = 0; i < arr.length; i++) {


        arr[i]+=artisMiktari;

    }
    return arr;




 //  for (int i = 0; i <arr.length ; i++) {

 //      arr[i]+=2;

 //  }
 //  return arr;







}


}
