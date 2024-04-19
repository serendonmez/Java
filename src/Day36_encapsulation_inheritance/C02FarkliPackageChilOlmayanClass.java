package Day36_encapsulation_inheritance;

import Day35_AccesModifier.C02Depo;

public class C02FarkliPackageChilOlmayanClass {

    public static void main(String[] args) {
        // static class uyelerini classIsmi.staticClassUyesiIsmi;


        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02Depo.defaultStr);
       // System.out.println(C02Depo.protectedStr);
        System.out.println(C02Depo.publicStr);

        C02Depo depo = new C02Depo();
        // static olmayan class uyelerini objeIsmi.staticOlmayanClassUyesiIsmi;


        //System.out.println(depo.privateSayi);
        // System.out.println(depo.defaultSayi);
       // System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);

    }
}
