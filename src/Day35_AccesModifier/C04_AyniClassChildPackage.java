package Day35_AccesModifier;

public class C04_AyniClassChildPackage {

    public static void main(String[] args) {

        //System.out.println(C02_Depo.privateStr);
        System.out.println(C02Depo.defaultStr);
        System.out.println(C02Depo.protectedStr);
        System.out.println(C02Depo.publicStr);

        C02Depo depo = new C02Depo();
        //System.out.println(depo.privateSayi);
        System.out.println(depo.defaultSayi);
        System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);
    }
}
