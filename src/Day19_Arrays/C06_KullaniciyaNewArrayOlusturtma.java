package Day19_Arrays;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaNewArrayOlusturtma {
    public static void main(String[] args) {
        // Kullanicidan int bir array’in boyutunu ve elementlerini alip array’i olusturan ve
        // bize donduren bir method olusturun.

        // soruda kullaniciya arr in boyutunu ve elementlerini soran ve ona göre olusturan bir method istiyor

        System.out.println(Arrays.toString(arrayOlusturma()));

    }
    public static int [] arrayOlusturma() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("arr in length ini giriniz");
        int length = scanner.nextInt();




        int arr[] = new int[length]; // -->int sayi =0; atamasi gibi bs bir atama yaptik.

        for (int i = 0; i < arr.length; i++) {

            System.out.println("indexteki "+i+". eleman icin deger girin");

            arr[i]= scanner.nextInt();



        }
        return arr;


    }

}
