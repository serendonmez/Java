package Day24_ArrayList_forEachLoop;

public class C05_forEachLoop {
    public static void main(String[] args) {
       // Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr= {3,2,4,1}; // output : 9+4+16+1=30

        int karelerinToplami=0;


        for ( int each:arr) {
            karelerinToplami += each *each;
        }
        System.out.println(karelerinToplami);

    }
}
