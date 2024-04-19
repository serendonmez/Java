package Day07__IfElseIfStatements_nestedIf;

import java.util.Scanner;

public class C01_IfElseIfstatements {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lütfen KG olarak kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        System.out.println(" Lütfen cm olarak boyunuzu girin : ");
        double boy = scanner.nextDouble();

        double vke = (kilo * 1000 / (boy * boy));
        System.out.println("Vücut kitle indeksiniz :" +vke);

        if (vke > 30) {
            System.out.println("obez");
        } else if (vke > 25) {
            System.out.println("kilolu");
        } else if (vke>20) {
            System.out.println("normal");
        } else  {
            System.out.println("zayif");

        }


    }}