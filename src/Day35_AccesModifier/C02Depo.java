package Day35_AccesModifier;

public class C02Depo {


    private int privateSayi;
    private static String privateStr;

    int defaultSayi ;
    static String defaultStr;

    protected int protectedSayi;
    protected static String protectedStr;

    public int publicSayi;
    public static String publicStr;

    // static keyword e dikkat eidlir, ayni class icinde privat variable lara ulasilir ancak cagrildigi method
    // static olmali


    public static void main(String[] args) {

        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
        System.out.println(publicStr);



    }



    public static void method1(){
        // method1 static oldugu icin access modifier yaninda
        // static keyword'e de dikkat etmemiz gerekir
        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
        System.out.println(publicStr);
    }

    public void method2(){
        System.out.println(privateSayi);
        System.out.println(privateStr);
        System.out.println(defaultSayi);
        System.out.println(defaultStr);
        System.out.println(protectedSayi);
        System.out.println(protectedStr);
        System.out.println(publicSayi);
        System.out.println(publicStr);
    }

}
