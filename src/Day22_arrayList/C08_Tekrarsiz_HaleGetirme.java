package Day22_arrayList;

import javax.sound.sampled.LineUnavailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_Tekrarsiz_HaleGetirme {
    public static void main(String[] args) {
        /*Soru 1- Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip
        bize dondurecek bir method olusturun
         */

        int[] arr = {3, 6, 5, 9, 8, 7, 1,9,5,9,5,9,5,9};
        arr=uniqueHaleGetir(arr);

        System.out.println("ertz");


        System.out.println(Arrays.toString(uniqueHaleGetir(arr)));
    }


    public static int[] uniqueHaleGetir(int[] arr) {


        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (! uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);

            }


        }
        System.out.println(uniqueList);
        // biz listeyi unique olarak olusturduk
        // simdi array'i listedeki elementlerin oldugu hale donusturmeliyiz



        int [] yeniArr= new int [uniqueList.size()]; // -->[0,0,0,0,0,0,0,0,0,0,0]

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]= uniqueList.get(i);


        }
        yeniArr=arr;


        return arr;
    }
}