package Day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_Arrays_ListArraysCevirme {
    public static void main(String[] args) {

        // array i For loop ile List e atama

        int [] arr= {2,3,6,5,47,8,9,22,5};



        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);

        }
        System.out.println(list);


    }
}
