package Day13_forLoop_nested_forLoop;

import day02_variable_scanner.C03_Scanner_SayininKaresiniAlma;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {
      /*  Kullanicidan satir ve sutun sayisini alip
        asagidaki sekilde tabloyu olusturun

                 * * * * * * * *
                 * * * * * * * *
                 * * * * * * * *
                 * * * * * * * *
                                */


        Scanner scann = new Scanner(System.in);
        System.out.println("satir sayisini girin : ");
        int satir = scann.nextInt();
        System.out.println("sutun sayisini girin");
        int sutun= scann.nextInt();

        for (int i =1 ; i <= satir; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("* "); // aralarindaki iliskiyi beilmedigimiz icin * görüntüsü olusturmak zorundayiz.
                                            // yine de * lardan olusan dikdörtgende ki satir ve sutunlar
                                            // kullanicinin girdigi satir ve sutun sayisina esit olmali.
            }


            System.out.println(""); // satir bitimi alt sazira indirmek icin hicligi loop un disinda yazdiririz.

        }



    }
}
