package Day10__StringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {
        String str= "Ali topu at, at Ali at";


        System.out.println(str.startsWith("top"));// false

        System.out.println(str.startsWith("top", 4)); // true

        // önce metin
        // sonra index no girilir
        // java ya sunu sormus oluruz: 4. index top ile mi basliyor --> true



        // indexOf () parametre olarak hem STring hem de char kabul eder

        System.out.println(str.indexOf("t")); // 4
        System.out.println(str.indexOf('t')); // 4
        System.out.println(str.indexOf("Ali")); // 0
        str.indexOf("pu at"); // 6
        System.out.println(str.indexOf(' ')); // 3
        // istersek char , istersek string kabul eder,

        System.out.println("§§§§§§§§§§§§§");

        System.out.println(str.indexOf("t,7")); // neden -1 verdi????

        System.out.println(str.indexOf("t", 7)); // ilkini "" icinde ikinci rakam//
        // 7. index ve sonrasindaki ilk t nin index ini verir. --->10


    }
}
