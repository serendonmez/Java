package Day13_forLoop_nested_forLoop;

import java.util.Scanner;

public class C11_NEstedForLoop {
    public static void main(String[] args) {
        /*
            kullanicidan satir sayisini alip
            asagidaki sekli olusturun

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satir= scanner.nextInt();
        System.out.println("");

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print( j+" ");

            }
            System.out.println("");
        }











    }
}
