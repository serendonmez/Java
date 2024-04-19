package Day19_Arrays;

import java.util.Arrays;

public class C02_ElemanlariToplama {
    public static void main(String[] args) {
        // verilen intelementteki tüm elemenetleri toplayip yazdiran bi method olusturun.

        int[] sayilar = {3,4,5,6};

        elemanlariTopla(sayilar); // 18

        System.out.println(Arrays.toString(sayilar));// [3, 4, 5, 6]

        int[] yeniarr ={6, 8, 9, 7, 12, 48};
        System.out.println(Arrays.toString(yeniarr));

        elemanlariTopla(yeniarr);


    }




    public  static void elemanlariTopla(int[] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];


        }

        System.out.println("arr in elemanlari toplami :"+toplam);




    }



}
