package Day16_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C06_whileLoop_doWhileLoop {
    public static void main(String[] args) {
        //- Kullanicidan baslangic ve bitis harflerini alip,
        // o harfleri ve aralarindaki harfleri yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Baslangic harifini girin ");

        char baslangicHarfi= scanner.next().charAt(0);
        System.out.println(" bitis harfi girin");
        char bitisHarfi=scanner.next().charAt(0);

        do {

                System.out.println(baslangicHarfi+ " ");
                baslangicHarfi++;


        }while ((baslangicHarfi>=bitisHarfi));


        // do-While döngüsünü sart uymasa bile kodu en azindan bi kere calistirmak icin
        // kullaniyoruz





    }
}
