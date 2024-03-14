package Day13_forLoop_nested_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        // for Loop ile 1 2 3 4 yazdirin
        for (int i = 1 ; i <=4 ; i++){
            System.out.print ( i +" ");

        }
        System.out.println(""); // alt satira gecmek icin

        // for loop ile  2 4 6 8 yazdir

        for (int i = 1 ; i <=4 ; i++){
            System.out.print ( 2*i +" ");

        }
        System.out.println("");

        // for loop ile 3 6 9 12

        for (int i = 1 ; i <=4 ; i++){

            System.out.print ( 3*i +" ");

        }
        System.out.println(""); // loopun disindaki sout lari ln li , loop icindekileri lnsiz yazdirmaliyiz-!!!!!!

        System.out.println(" dikdörtgen biciminde konsol ciktisi icin nested for loop kullanilir ");


        for (int i = 1; i <=3 ; i++) { // ilk for loop satir kontrol eder

            for (int j = 1; j <=4 ; j++) { // 2. sutun kontrol eder
                System.out.print(i*j + " "); // loop un icinde yazdirdigimiz sout ln 'siz olmali

            }
            System.out.println("");

        }





    }
}
