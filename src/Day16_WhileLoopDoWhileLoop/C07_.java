package Day16_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C07_ {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        // Ornek : input : 16, output: 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bi tam sayi girin ");
        int sayi= scanner.nextInt();
        int karekok =1 ;
        boolean tamKareMi =false;


        while (karekok* karekok <= sayi){
            if (karekok * karekok == sayi){
                tamKareMi =true;
            }
            karekok++;
        }
        System.out.println(tamKareMi);
    }
}
