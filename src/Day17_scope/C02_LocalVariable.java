package Day17_scope;

public class C02_LocalVariable {
    /*
    1- Local Varisble lar bir kod blogun icinde olusturulur.
        baska bir yerde kullanilamaz
        2- Local variable'lar deger atamadan deklare edilebilir
           ama deger atamadan kullanilamaz
        3- Local variable'lar static olarak tanimlanamaz
        4- Her ne kadar bir method'un icinde olsalar da
           Loop'larin da kendi scope'u vardir
           bir loop'un icinde olusturulan variable, loop'un disinda kullanilamaz

           Loop'un oldugu method'da loop'dan once olusturulan variabler
           loop icerisinde kullanilabilir
     */

    public static void main(String[] args) {
        int sayi;
        String s;

        // int c = 2 * sayi; // Variable 'sayi' might not have been initialized
        // System.out.println(s); // Variable 's' might not have been initialized

        // static int d = 20; // Modifier 'static' not allowed here

        sayi=10;

        for (int i = 0; i <sayi ; i++) {

            System.out.println(sayi);
            sayi--;
        }
    }






}
