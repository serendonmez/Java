package Day35_AccesModifier;

public class C03_AyniPackageFarkliClass {
    public static void main(String[] args) {
        // System.out.println(C02_Depo.privateStr);
        // class üzerinden method var
        System.out.println(C02Depo.defaultStr);
        System.out.println(C02Depo.protectedStr);
        System.out.println(C02Depo.publicStr);

        C02Depo depo = new C02Depo();
        //System.out.println(depo.privateSayi);

        // obj üzeriinden method
        System.out.println(depo.defaultSayi);
        System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);

    }
}
