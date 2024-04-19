package Day19_Arrays;

public class C05_ElemanArama {
    public static void main(String[] args) {
        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,5,6,2,3,6,7,9,6,5,4,9,3,4,5};

        elemanArama(arr, 9);




    }
     public static void elemanArama (int arr[], int aranilanEleman) {


         int kacKere =0;

         for (int i = 0; i < arr.length  ; i++) {


             if (arr[i]==aranilanEleman){
                 kacKere++;
             }


         }

         if (aranilanEleman==0) {
             System.out.println(" aradigniz eleman Arr de yok.");
         }else {
         System.out.println(" aradiginiz eleman Arr de "+kacKere +"kadar kullanilmis");}




     }



}
