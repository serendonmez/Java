package Day20_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {


        // verilen int bir arrayde;
        // verilen min ve max degerler dahil olarak
        // min ve max degerler arasindaki sayilari yazdiran bir method olusturun




        int [] sayilar= {14,15,36,69,78,96,12,36,951,23};


        AraliktakiSayilariYazdir(sayilar, 10,70 );
        AraliktakiSayilariYazdir(sayilar,200,500); // olmayan aralik icin bos yazdirir
    }

    public static void AraliktakiSayilariYazdir (int arr[], int minDeger,int maxDeger){





        for (int i = 0; i <arr.length ; i++) {
            if ( arr[i]> minDeger && arr [i]< maxDeger){
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println("");

    }








}
