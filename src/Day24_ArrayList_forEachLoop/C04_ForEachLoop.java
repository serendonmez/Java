package Day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {
       // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.


        int[] arr= {3,3,4,4,5,4,3,6,5,4,3,2}; // 3,4,5,2,6

        // yeni bir arr olusturup tek tek bakip elemanlari tekrar etmeden yazdirmaliyiz


        List<Integer> benzersizList= new ArrayList<>();

                    // int [] yeniArr= new int[] direk yeni arr olustursaydik lengthini yazmamiz gerekirdi
                // list ile benzersiz elemanlari alip onun lengthi kadar sonradan arr olusturabiliriz.

             for(int each: arr){
                 if (!benzersizList.contains(each)){
                     benzersizList.add(each);
                 }
             }
        System.out.println(benzersizList); //
         int [] yeniArr= new int [benzersizList.size()];

        for (int i = 0; i < benzersizList.size(); i++) {
            yeniArr[i]= benzersizList.get(i);

        }
        System.out.println(Arrays.toString(yeniArr));


        // arr den eleman silmedigimiz icin yeni arr oluturup list teki degrleri ona atiycaz




    }
}
