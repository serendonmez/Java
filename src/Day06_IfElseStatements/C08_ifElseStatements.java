package Day06_IfElseStatements;

import java.util.Scanner;

public class C08_ifElseStatements {
    public static void main(String[] args) {
        // soruda 2 sart varsa baska ihtimal yoksa
        // if else ile soru cözülür




        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin

        Scanner scanner = new Scanner( System.in) ;
        System.out.println(" lütfen ücgenin kenar uzunluklarini girin");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();


        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0) {
            System.out.println(" eskenar ücgen");

        } else {
            System.out.println("eskenar ücgen degil"); }


    }
}
