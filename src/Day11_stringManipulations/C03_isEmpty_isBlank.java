package Day11_stringManipulations;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {

        String str= ""; //hiclik = empty
        System.out.println(str.isEmpty()); // true empty = hiclik
        System.out.println(str.length()); // 0
        System.out.println(str.isBlank()); // true blank =bosluk // ?

        String str2=" "; // blank == bosluk space

        System.out.println(str2.length()); //1
        System.out.println(str2.isEmpty()); // false
        System.out.println(str2.isBlank()); // true

        String str3= "            ";
        System.out.println(str3.length()); // 12
        System.out.println(str3.isEmpty()); // false length 0 mi kontrol eder, eger 0 ise true doner
        System.out.println(str3.isBlank()); // true
        // length 0 olmasa da sadece space'lerden olusuyorsa true doner













    }
}
