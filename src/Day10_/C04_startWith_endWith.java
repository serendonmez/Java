package Day10_;

public class C04_startWith_endWith {
    public static void main(String[] args) {
        String str= "Ali topu at, at Ali at";
        System.out.println(str.contains("Ali")); // true
        System.out.println(str.contains("top")); // true
        System.out.println(str.contains("at")); // true



        //str Ali ile bitiyor mu?


        System.out.println(str.endsWith("Ali")); // false

        // str Ali ile basliyor mu?

        System.out.println(str.startsWith("Ali")); // true
        System.out.println(str.startsWith("A"));//true
        System.out.println(str.startsWith("Ali topu at")); // true
        System.out.println(str.startsWith("Ali topu at, at Ali at")); // true
        System.out.println(str.endsWith("Ali topu at, at Ali a"));// true

        System.out.println(str.startsWith("")); // true hiclik
        System.out.println(str.endsWith("")); // true hiclik

        System.out.println(str.startsWith("top")); // false

    }
}
