package Day08_ternary_switchstatements;

public class C03_TernaryOP {
    public static void main(String[] args) {

        /* ternary de iki olasilik olur
        eger bu iki olasiliktan birinde atama digerinde yazma varsa If tercih edilmeli
         */

        int sayi = 20;

        // verilen sayi 10'dan buyukse degerini 3 azaltin---> deger atama
        // 10'dan buyuk degilse "Bu sayi cok kucuk" yazdirin --> yazdirma görevi var


        if (sayi>10) {
            sayi -=3;

        }

        else {
            System.out.println(" bu sayi cok kücük ");
        }

        System.out.println( " IF-else den sonra sayi : "+ sayi); // 17

        // bunu ternary ile yaparsak

        System.out.println(sayi > 10 );


    }
}
