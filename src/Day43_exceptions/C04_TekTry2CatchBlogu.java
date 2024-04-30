package Day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TekTry2CatchBlogu {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesir ";

        // Kullanicidan pozitif bir tamsayi alin
        // ve bu tamsayiyi index olarak kabul edip
        // str'da o index'deki harfi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        try {
            int index = scanner.nextInt(); // InputMissmatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
        } catch (InputMismatchException e) {

            System.out.println("tam sayi giriniz ");

        }catch (StringIndexOutOfBoundsException e){

            System.out.println("girdigniz index metnin sinirlari disinda");
        }


    }
}
