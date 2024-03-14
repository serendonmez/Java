package Day13_forLoop_nested_forLoop;

public class C12NestedTersUcgenODev {
    public static void main(String[] args) {
        /* nested for Loop ile asagidaki sekli olusturun.

        * * * * *    1. satir , 5 sutun
        * * * *     2.satir  4 sutun
        * * *       3. satir 3 sutun
        * *         4. satir ,2 sutun
        *           5. satir  1 sutun
                                                                    */

        //   for (int i = 1; i <=5 ; i++) {

        //       for (int j = 5 ; j >6-i ; j--) {

        //       System.out.print( "* ");
        //       }

        //       System.out.println("");



        //   }


        for  (int i = 1; i <= 5 ; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }






    }
}
