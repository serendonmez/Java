package Day13_forLoop_nested_forLoop;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        /* nested for Loop ile asagidaki sekli olusturun.


        * //        satir sayisi = 1  - sutun sayisi=1 i=1  J= 1
        * * //      satir sayisi = 2 Sutun sayiyi = 1 ve 2
        * * * //    satir sayisi  = 3 Sutun sayisi = 1 , 2 ,  ve 3
        * * * * //   satir saiyyi = 4 sutun 1,2,3, ve 4
        * * * * * // satir sayisi =5 sutun = 1,2,3,4 ve 5


         */

        for (int i = 1; i <=5 ; i++) { // satirlari kontrol eder
            for (int j = 1; j <=i; j++) {// her satirdaki sutunlari kontrol eder
                System.out.print("* ");

            }

            System.out.println("");





        }







    }
}
