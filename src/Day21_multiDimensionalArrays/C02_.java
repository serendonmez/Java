package Day21_multiDimensionalArrays;

public class C02_ {

    public static void main(String[] args) {
        // verilen iki katli int arr deki
        // tüm sayilarin toplamini yazdiran bir method olusuturun


        int [][] arr= {{3,6},{1,6,9},{8,0,2,1},{4}};

      //  elemanlarinToplaminiYazdir();


        System.out.println(arr[0][0]);

    }

    public static void elemanlarinToplaminiYazdir (int[][] arr){
        // Eger ihic bir sart olmaksizin
        //2 katli arraydeki tum elementlere ulasmak isterseniz
        // 2 katli nested bir loop olusturmulmali

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) { // outer arr ' yi kontrol eder
            for (int j = 0; j < arr[i].length ; j++) { // her bir inner arr i kontrol eder
                toplam+= arr[i][j];

            }

        }
        System.out.println(toplam);
    }
}
