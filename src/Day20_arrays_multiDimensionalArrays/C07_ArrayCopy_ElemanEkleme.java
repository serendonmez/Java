package Day20_arrays_multiDimensionalArrays;

import java.sql.Array;
import java.util.Arrays;

public class C07_ArrayCopy_ElemanEkleme {
    public static void main(String[] args) {


        String [] src = {"1","5","9","7","896","12","85","78"}; //8

        String  [] dest= {"kas","tz","ert","458","23567"};// 5



        //public static void arraycopy(Object src,-->kayank dizisi
        // int srcIndex, -->Kaynak dizisinin baslangic indexi
        // Object dest, --> hedef index
        // int destIndex,-->hedef diinin baslangic indexi
        // int len) -->Kayank diziden hedef diziye copy yapilacak eleman miktari


        System.arraycopy(src,2, dest,3,2);


        System.out.println(" dest Array Final :");
        for (int i = 0; i < dest.length ; i++) {
            System.out.print(dest[i]+" ");

        }


        }



}
