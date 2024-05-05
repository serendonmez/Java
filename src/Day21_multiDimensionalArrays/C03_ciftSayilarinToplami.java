package Day21_multiDimensionalArrays;

public class C03_ciftSayilarinToplami {
    public static void main(String[] args) {
        // verilen 2 katli bi arrayde bulunan cift sayilari toplayip
        // sonucu yazdiran bir method olusturun

        int [][] arr= {{3,6},{1,6,9},{8,0,2,1},{4}};
        ciftsayilaritopla(arr);
    }

    public static void ciftsayilaritopla (int [][] arr){ // arr[i] = arr[0] = {3,6}
                                                        // arr[i][j] = arr[0][0]=3
        int toplam= 0;
        for (int i = 0; i <arr.length ; i++) { //
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }

            }

        }
        System.out.println(toplam);


    }
}
