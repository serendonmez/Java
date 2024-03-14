package Day06_IfElseStatements;

import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.



        Scanner scanner= new Scanner(System.in);

        System.out.println(" lütfen ücgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

      //  if ( kenar1== kenar2 == kenar3 ) 3 lü karsilastirma olmaz

        if ( kenar1== kenar2 && kenar1 ==kenar3 && kenar1 >0){
            System.out.println(" eskenar ücgen ");

        }






        // Kullanicidan notunu 50 alin
    }
}
